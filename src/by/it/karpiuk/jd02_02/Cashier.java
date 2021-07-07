package by.it.karpiuk.jd02_02;

public class Cashier implements Runnable{

    private final int number;
    public Cashier(int number){this.number = number;}

    @Override
    public void run() {
        System.out.println(this+" opened");
        while (!Dispatcher.shopClosed()){
            Customer currentCustomer = Queue.poll();
            if (currentCustomer != null){
                System.out.println(this + "started service " + currentCustomer);
                int cashierWork = RandomHelper.random(2000,5000);
                TimerHelper.sleep(cashierWork);
                synchronized (currentCustomer.getMonitor()){
                    currentCustomer.setWaitFlag(false);
                    currentCustomer.notify();
                }
                System.out.println(this +" finished service"+currentCustomer);
            }else {
                TimerHelper.sleep(1);
            }
        }
        System.out.println(this+" closed");
    }

    @Override
    public String toString() {
        return String.format("\rCashier #%d ", number);
    }
}
