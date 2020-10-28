package main;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

enum Months {
    JANUARY(31), FEBRUARY(29), MARCH(31), APRIL(30), MAY(31),
    JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31),
    NOVEMBER(30), DECEMBER(31);

    private final int numOfDays;

    Months(int numOfDays){
        this.numOfDays = numOfDays;
    }
}
