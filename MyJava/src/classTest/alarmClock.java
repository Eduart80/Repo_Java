package classTest;

import java.util.Calendar;

public class alarmClock {

    public static void main(String[] args) {


        Calendar dd = Calendar.getInstance();
       // dd.add(Calendar.DATE , 3);   // to add days in calendar
        int dayOfWeek = dd.get(Calendar.DAY_OF_WEEK);

        switch (dayOfWeek) {
            //Sunday
            case 1 -> System.out.println("Today is Sunday");
            //Monday
            case 2 -> System.out.println("Today is Monday");
            //Tuesday
            case 3 -> System.out.println("Today is Tuesday");
            //Wednesday
            case 4 -> System.out.println("Today is Wednesday");
            //Thursday
            case 5 -> System.out.println("Today is Thursday");
            //Friday
            case 6 -> System.out.println("Today is Friday");
            //Saturday
            case 7 -> System.out.println("Today is Saturday");
            //default
            default -> System.out.println("Vacation");
        }

        ////////
        if(dayOfWeek >= 1 && dayOfWeek <=5){
            System.out.println("Alarm at 7am");
        }else if(dayOfWeek == 6 || dayOfWeek == 0) {
            System.out.println("Alarm at 10am");
        }else {
            System.out.println("holiday");
        }

    }
}
