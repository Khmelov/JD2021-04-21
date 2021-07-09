package by.it.nakov.jd02_06;

import by.it.nakov.jd02_04.PathCreator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static final String LOG_TXT = "log.txt";
    private static volatile Logger logger;
    private static final Object LOGGER_MONITOR = new Object();

    public Logger() {
    }

    public static Logger getLogger() {
        Logger logger1 = logger;
        if (logger1 == null) {
            synchronized (LOGGER_MONITOR) {
                logger1 = logger;
                if (logger1 == null) {
                    logger1 = logger = new Logger();
                }
            }
        }
        return logger1;
    }

    void log(String message) {
        String path = PathCreator.getFileName(Logger.class, LOG_TXT);
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(path, true));
            printWriter.println(message);
            printWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
