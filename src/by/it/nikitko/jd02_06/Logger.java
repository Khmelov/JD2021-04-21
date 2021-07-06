package by.it.nikitko.jd02_06;

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
        Logger localeLogger = logger;
        if (localeLogger == null) {
            synchronized (LOGGER_MONITOR) {
                localeLogger = logger;
                if (localeLogger == null) {
                    localeLogger = logger = new Logger();
                }
            }
        }
        return localeLogger;
    }

    void log (String message){
        String path = PathCreator.getFileName(Logger.class,LOG_TXT);
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
