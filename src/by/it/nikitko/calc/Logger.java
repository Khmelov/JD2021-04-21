package by.it.nikitko.calc;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public enum Logger {
    INSTANCE;
    private static final String LOG_TXT = "log.txt";

    Logger() {
    }

    void log (String message){
        String path = PathCreator.getFileName(Logger.class,LOG_TXT);
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(path,true));
            printWriter.println(message);
            printWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
