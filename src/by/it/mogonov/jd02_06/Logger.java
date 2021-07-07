package by.it.mogonov.jd02_06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

class Logger {


    private static volatile Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        Logger localInstance = instance;
        if (localInstance == null) {
            synchronized (Logger.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Logger();
                }
            }
        }
        return localInstance;
    }

    Runnable log(String logTxt) {

        Date wr = Calendar.getInstance().getTime();
        String data = String.valueOf(wr);
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter(PathCreator.getFileName(Logger.class, "log.txt"), true));
            w.write(new StringBuilder().append(logTxt).append(" ").append(data).toString());
            w.newLine();
            w.flush();
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

