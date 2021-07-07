package by.it.stain.jd02_06;

public class Runner extends Thread {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Runnable runnable = () -> Logger.getLogger().log("Hello World!");
            new Thread(runnable).start();
        }
    }
}
