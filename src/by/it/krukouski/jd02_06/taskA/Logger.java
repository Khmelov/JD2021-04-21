package by.it.krukouski.jd02_06.taskA;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static volatile Logger logger;
    private static final String FILE_NAME = "log.txt";

    private Logger() {
    }

    public static Logger getLogger() {
      Logger local = logger;
        if (local == null) {
            synchronized (FILE_NAME) {
                local = logger;
                if (local == null) {
                    local = logger = new Logger();
                }
            }
        }
        return local;
    }

    @SuppressWarnings("SameParameterValue")
    void log(String message) {
        String fileName = getFileName(Logger.class, Logger.FILE_NAME);
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(fileName, true))) {
            printWriter.println(message);
            printWriter.flush();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    @SuppressWarnings("SameParameterValue")
    static String getFileName(Class<?> nameClass, String fileName) {
        String root = System.getProperty("user.dir");
        String path = nameClass
                .getName()
                .replace(nameClass.getSimpleName(), "")
                .replace(".", File.separator);
        return root + File.separator + "src" + File.separator + path + fileName;

    }

}
