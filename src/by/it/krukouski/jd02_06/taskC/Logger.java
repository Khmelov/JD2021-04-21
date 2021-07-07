package by.it.krukouski.jd02_06.taskC;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    public static class LoggerNested{
        public static final Logger LOGGER_INSTANCE = new Logger();
    }

    private Logger() {
    }

    private static final String FILE_NAME = "log.txt";

    static Logger getLogger(){
        return LoggerNested.LOGGER_INSTANCE;
    }

    void log(String message){
        String fileName = getFileName(Logger.class, FILE_NAME);
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(fileName, true))
        ) {
            printWriter.println(message);
            printWriter.flush();
        } catch (IOException e) {
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
