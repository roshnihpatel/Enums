package com.sparta.rp;

public enum Days { //already has an Enum parent class so can not extend other classes
    MONDAY("Monday",1),
    TUESDAY("Tuesday",2),
    WEDNESDAY("Wednesday",3),
    THURSDAY("Thursday",4),
    FRIDAY("Friday",5),
    SATURDAY("Saturday",6),
    SUNDAY("Sunday",7),
    ;

    Days(String name, int dayOfWeek) {
        this.name = name;
        this.dayOfWeek = dayOfWeek;
    }

    private String name;
    private int dayOfWeek;



}
