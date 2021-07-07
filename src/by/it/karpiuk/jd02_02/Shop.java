package by.it.karpiuk.jd02_02;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public static void main(String[] args) {
        System.out.println("Shop is opened");
        List<Thread> threads = new ArrayList<>();

        for(int cashierCounter = 1; cashierCounter<=2;cashierCounter++){
            Cashier cashier = new Cashier(cashierCounter);
            Thread thread = new Thread(cashier);
            threads.add(thread);
            thread.start();
        }



        int customerCount = 0;
        while (Dispatcher.shopOpened()){
            int customersPerSec = RandomHelper.random(2);
            for (int i = 0; i < customersPerSec; i++) {
                Customer customer = new Customer(++customerCount);
                threads.add(customer);
                customer.start();
            }
            TimerHelper.sleep(1000);
        }
        for (Thread thread:threads){
            try {
                thread.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }


        System.out.println("Shop is closed");
    }
}
