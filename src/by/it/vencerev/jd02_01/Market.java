package by.it.vencerev.jd02_01;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;

public class Market {

    private static void Main1(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Dispatcher.currentCountBuyers =0;
            Main1(args);
    }

        }




    public static void main(String[] args) {
        System.out.println("Market opened");
        List<Buyer> buyers = new ArrayList<>();
        int number = 0;
        for (int time = 0; time < Config.MAX_TIME ; time++) {
            int countBuyerPerSecond = RandomHeper.random(2);
            for (int i = 0; i < countBuyerPerSecond; i++) {

            }
            Buyer buyer = new Buyer(++number);
            buyers.add(buyer);
            buyer.start();
        }
        TimerHelper.sleep(1000);
        for (Buyer buyer : buyers){
                try {
                    buyer.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        while (Dispatcher.currentCountBuyers > 0){
            Thread.onSpinWait();
        }


        System.out.println("Market closed");
    }
}
