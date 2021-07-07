package by.it.mogonov.jd02_06;

import java.io.IOException;

import static by.it.mogonov.jd02_06.Logger.*;

public class Runner extends Thread {

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 10; i++) {
            Runnable runnable = getInstance().log("ERROR");
            new Thread(runnable).start();
        }
    }
}