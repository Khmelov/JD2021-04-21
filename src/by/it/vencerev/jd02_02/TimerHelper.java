package by.it.vencerev.jd02_02;

import java.util.Random;

public class TimerHelper {

    static void sleep(int timeout) {
        try {
            Thread.sleep(timeout / Config.KEY_SPEED);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

