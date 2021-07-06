package by.it.krukouski.jd02_06.taskA;

public class Runner extends Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()-> Logger.getLogger().printLog("Text")).start();
        }

    }
}
