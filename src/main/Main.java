/*   Created by IntelliJ IDEA.
 *   Author: Pratik Sharma (pratik121212)
 *   Date: 28-10-2020
 *   Time: 22:32
 *   File: Main.java
 */

package main;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int currentDay = new GregorianCalendar().get(Calendar.DATE);
        String currentMonth = new GregorianCalendar().getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH).toUpperCase();
        int totalNumOfDays = new GregorianCalendar().getActualMaximum(Calendar.DAY_OF_MONTH);
        int noOfDaysLeft = totalNumOfDays - currentDay;
        System.out.println(noOfDaysLeft + " days left in " + currentMonth + "!");

    }

}