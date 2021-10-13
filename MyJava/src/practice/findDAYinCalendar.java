package practice;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

class findDAYinCalendar {
    public static String findDay(int month, int day, int year) {

        return LocalDate.of(year, month, day).getDayOfWeek().name();
    }
    public static String findDay22(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.YEAR, year);
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
    }
    public static void main(String[] args) {
        System.out.println(findDay(10, 1, 2021));
        System.out.println(findDay22(10,1,2021));
    }
}

