package by.it.krukouski.jd02_06.taskB;

import java.time.LocalDateTime;

public class Time {

    LocalDateTime localDateTime;

    public String getTime() {
        this.localDateTime = LocalDateTime.now();
        return localDateTime.toString();
    }
}
