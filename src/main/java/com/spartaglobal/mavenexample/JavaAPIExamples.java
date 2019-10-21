package com.spartaglobal.mavenexample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class JavaAPIExamples {

    public void  mathExamples(){
        System.out.println(Math.sqrt(25));

    }


    public void dateTime(){
        System.out.println(LocalDate.now());
        LocalDate localDate = LocalDate.of(1998,8,20);
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());
    }
}
