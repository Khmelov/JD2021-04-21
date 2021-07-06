package by.it.sapazhkou.jd02_06;

public class Runner extends Thread {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                 Logger.getLogger().log("LogText");
                }
            };
            new Thread(runnable).start();
        }
    }

}
