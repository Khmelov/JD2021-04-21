package by.it.karpiuk.jd02_01;

import java.util.HashMap;

public class GoodsInBasket {
    private static final HashMap<String, Integer> GoodsInBasket = new HashMap<>();

    static {
        GoodsInBasket.put("T-shirt",10);
        GoodsInBasket.put("Jeans", 25);
        GoodsInBasket.put("Shoes", 30);
        GoodsInBasket.put("Socks", 5);
    }
    public static HashMap<String,Integer> GetGoodsInBasket(){return GoodsInBasket;}
}
