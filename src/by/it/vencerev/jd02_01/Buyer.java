package by.it.vencerev.jd02_01;

public class Buyer extends Thread implements IBuyer{


    private long number;

    public Buyer (long number){
        super("Buyer № " + number+" ");
        this.number = number;
    }

    @Override
    public void run() {
        Dispatcher.currentCountBuyers++;
        enterToMarket();
        chooseGoods();
        goOut();
        Dispatcher.currentCountBuyers--;
    }

    @Override
    public void goToQueue() {

    }

    @Override
    public void enterToMarket() {
        System.out.println(this + " entered the market");
    }

    @Override
    public void chooseGoods() {
        System.out.println(this + "Start choose goods");
        int timeout = TimerHelper.random(500,2000);
        TimerHelper.sleep(timeout);
        System.out.println(this + "Finish choose goods");

    }

    @Override
    public void goOut() {
        System.out.println(this + "leaves the market");

    }

    @Override
    public String toSting(){
        return this.getName();
    }



}



