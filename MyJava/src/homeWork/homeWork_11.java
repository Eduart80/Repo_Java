package homeWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class homeWork_11 {
    public static void main(String[] args) throws ParseException {

//      //// add tim by 2 hours
        timeIn(5); // how many times
    }

    public static void timeIn(int number) throws ParseException {
        Calendar inCal = Calendar.getInstance();  //calendar Object

        for(int i=0;i<number;i++) {
            Date myDate = inCal.getTime();  // Date Object
            inCal.add(Calendar.HOUR, 2);    //Count per 2h
            SimpleDateFormat df = new SimpleDateFormat("h:mm a"); //Simple form
            String date = df.format(myDate);
            System.out.println(date);

        }





    }
}
    /**String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
            "green",  "red", "yellow", "yellow", "grey", "blue" , "yellow", "grey",
            "green", "blue",  "yellow", "grey", "green", "blue", "green", "green",
            "green", "green"};
*/
/**
 * Question 1:
 * Create a method that will take String-array as input
 *
 * If there is a color with maximum count, return the color name
 * If there are two or more colors with same number, return all.
 */


/**
 * Question 2:
 * Create a method that will take an int as input.
 * return the timeline (hour am/pm) with interval of 2 hour from the current hour.
 */
/**
 System.out.println(generateTimline(5));
 10pm 12am 2am 4am 6am

 System.out.println(generateTimline(8)); // executing method at 9am
 11am 1pm 3pm 5pm 7pm 9pm 11pm 1am
 */
