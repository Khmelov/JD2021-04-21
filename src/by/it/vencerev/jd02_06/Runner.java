package by.it.vencerev.jd02_06;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Runner extends Thread {
    public static void main(String[] args) {
        Class<Logger> loggerClass = Logger.class;
        for (int i = 0; i < 100; i++) {
            new Thread(()->Logger.getLogger().log("txt")).start();
        }
    }
}

