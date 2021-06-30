package by.it.vencerev.jd02_01;

import java.util.Random;

public class TimerHelper {

    private static final Random RANDOM = new Random();

    static int random(int min, int max){
        return min+RANDOM.nextInt(max-min+1);
    }

    static int random(int max){
        return random(0,max);
    }
    static void sleep (int timeout){
            try {
                Thread.sleep(timeout/Config.K_SPEED);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

