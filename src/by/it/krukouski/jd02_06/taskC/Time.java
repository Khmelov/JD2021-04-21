package by.it.krukouski.jd02_06.taskC;

import java.util.Calendar;

public class Time {


    Calendar calendar;

    public String getTime(){
        this.calendar=Calendar.getInstance();
        return calendar.getTime().toString();
    }


}
