package labs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class date_time {
    public static void main(String[] args) {

        //LocalDateTime myTime = LocalDateTime.now();
        //System.out.println(": "+myTime);
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println("Date: "+date);
        System.out.println("Time: "+time);
    }
}
