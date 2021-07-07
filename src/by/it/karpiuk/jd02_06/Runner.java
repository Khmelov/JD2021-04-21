package by.it.karpiuk.jd02_06;

public class Runner extends Thread {

    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            Runnable runnable = () -> Logger.getLogger().log("Date&time of error");
            new Thread(runnable).start();
        }
    }
}
