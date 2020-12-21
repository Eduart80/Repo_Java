package labs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class date_time {
    public static void main(String[] args) {

        //LocalDateTime myTime = LocalDateTime.now();
        //System.out.println(": "+myTime);
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println("Date: "+date);
        System.out.println("Time: "+time);

        //print hour min and pm/am
        Date dn = new Date();  //Date Object
        SimpleDateFormat num = new SimpleDateFormat("hh:ss a");
        System.out.println(" from date "+num.format(dn));

        Calendar inCal2 = Calendar.getInstance(); // Calendar Object
        System.out.println("from Cal "+ inCal2.getTime());

        Calendar inCal = Calendar.getInstance();  //calendar object
        Date datN = inCal.getTime();
        System.out.println(datN);

        Date myParsee = null;
        String  dateText = "Nov 07, 2020 9:47";   /// it mast match with simpleDataFormat
        SimpleDateFormat dTime = new SimpleDateFormat("MMMM dd, yyyy h:mm");
        try {
            myParsee = dTime.parse(dateText);
            System.out.println("iner "+myParsee);
        }catch (ParseException e){
            e.printStackTrace();
        }
        inCal.setTime(myParsee);
        System.out.println("from calendar "+inCal);
//////////////////////////////////////////////////////////////
        Calendar myCalendar = Calendar.getInstance();
        Date myDate = myCalendar.getTime();
        SimpleDateFormat df = new SimpleDateFormat("h:mm a");
        String date2 = df.format(myDate);
        System.out.println(date2);

    }
}
