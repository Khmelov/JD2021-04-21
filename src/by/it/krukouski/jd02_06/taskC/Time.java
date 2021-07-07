package by.it.krukouski.jd02_06.taskC;

import java.time.LocalTime;

public class Time {
    LocalTime localTime;

    public String getTime(){
        this.localTime=LocalTime.now();
        return localTime.getHour() + ":" + localTime.getMinute() + ":" + localTime.getSecond();
    }
}
