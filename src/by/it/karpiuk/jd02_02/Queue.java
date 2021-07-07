package by.it.karpiuk.jd02_02;

import java.security.PublicKey;
import java.util.ArrayDeque;
import java.util.Deque;

public class Queue {
    private static final Object MONITOR_QUEUE = new Object();
    private Queue(){

    }
    private static final Deque<Customer> CUSTOMERS = new ArrayDeque<>();

    public static Customer poll(){
        synchronized (MONITOR_QUEUE){
            return CUSTOMERS.pollFirst();
        }
    }

    public static void add(Customer customer){
        synchronized (MONITOR_QUEUE){
            CUSTOMERS.addLast(customer);
        }
    }
}
