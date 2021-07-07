package by.it.karpiuk.jd02_01;



import java.util.ArrayList;
import java.util.HashMap;

public class Customer extends Thread implements IBuyer, IUseBasket {
    private long number;
    HashMap<String, Integer> basket = new HashMap<>();

    public Customer(long number) {
        super("Customer № " + number + " ");
        this.number = number;
    }

    @Override
    public void run() {
        Dispatcher.currentCustomers++;
        shopEntry();
        startShopping();
        takeBasket();
        putGoodsToBasket();
        shopLeave();
        Dispatcher.currentCustomers--;
    }

    public void putGoodsToBasket() {
        ArrayList<String> goodsInBasketList = new ArrayList<>(GoodsInBasket.GetGoodsInBasket().keySet());
        int timeDelation = RandomHelper.random(2000, 5000);
        int numberOfGoods = RandomHelper.random(1,4);
        for (int i = 0; i < numberOfGoods; i++) {
            TimerHelper.sleep(timeDelation);
            int good = RandomHelper.random(goodsInBasketList.size()-1);
            basket.put((goodsInBasketList.get(good)), GoodsInBasket.GetGoodsInBasket().get(good));
            System.out.println(this+"put "+goodsInBasketList.get(good)+"into the basket for "+GoodsInBasket.GetGoodsInBasket().get(goodsInBasketList.get(good)+"$"));
        }

    }


    public void takeBasket() {
        int timeDelation = RandomHelper.random(500, 2000);
        TimerHelper.sleep(timeDelation);
        System.out.println(this + "took basket");
    }


    @Override
    public void shopEntry() {
        System.out.println(this + "entered the shop");
    }

    @Override
    public void startShopping() {
        System.out.println(this + "started shopping");
        int timeout = RandomHelper.random(500, 2000);
        TimerHelper.sleep(timeout);
        System.out.println(this + "finished shopping");

    }

    @Override
    public void shopLeave() {
        System.out.println(this + "leaved the shop ");
    }

    @Override
    public String toString() {
        return this.getName();
    }
}


