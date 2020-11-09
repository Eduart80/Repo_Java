package homeWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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

        String[] arr = {"green","red", "red","blue",
                "yellow", "grey", "green",
                "red", "grey","green", "yellow", "yellow", "grey", "blue" , "yellow", "grey",
                "green", "blue", "hot", "yellow",  "green", "blue", "green", "green","White","White"};

        /// find
        System.out.println( findIn(arr));
    }

    public static Map<String, Integer> findIn(String[] name){
        Map<String, Integer> wordCount = new HashMap<>();
        //List<String> list = new ArrayList<>();
        for (int i=0; i<name.length; i++){
            String wordsA = name[i];
            int count = 0;
            for(int j=0;j<name.length;j++) {
                if (j<i && name[i]==name[j]) {
                    break;
                }
                if(name[i]==name[j]){
                    count++;
                }
            }
            if (count > 1 && !wordCount.containsKey(wordsA.toLowerCase())) {
                wordCount.put(wordsA.toLowerCase() ,count);
            }
        }

        return wordCount;
    }

}

