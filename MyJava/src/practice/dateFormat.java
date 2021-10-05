package practice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateFormat {
    public static void main(String[] args) {

        System.out.println(time("07:05:45PM"));
    }
    public static String time(String s) {

        String[] sp = s.split("");
        String resD = "";
        int count = 0;
        for (int i = 0; i < sp.length; i++) {
            if (sp.length > 8 && count <= 7) {
                resD += sp[i];
                count++;
            }
        }
        DateFormat df = new SimpleDateFormat("HH:mm:ss");

        SimpleDateFormat output = new SimpleDateFormat("HH:mm:ss");

        Date Adate = null;
        try {
            Adate = df.parse(resD);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return output.format(Adate);
    }
}
