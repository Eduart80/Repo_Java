package homeWork;

import java.util.Arrays;

public class homeWork_5 {
    public static void main(String[] args) {
        // Subject - Homework-5

        /**
         * Write code/method to return abbreviation for any given string
         */
        String msg = "Outfit of the day";
        String[] msgSplit = msg.split(" ");
        for (String intoLoop : msgSplit) {
            System.out.print(intoLoop.substring(0, 1).toUpperCase());
        }
        /////// separator 1
        System.out.println("\n");

        String line = "i dId tHiS";   //  Once Upon A Time In The Universe
        System.out.println("Line (Before modification) : " + line);
        line = line.toLowerCase();
        String[] lineSplit = line.split(" ");

        for (int i = 0; i <= lineSplit.length - 1; i++) {
            String modification = lineSplit[i].substring(0, 1).toUpperCase();
            String mod2 = lineSplit[i].substring(1);
            String theWord = modification + mod2;
            System.out.println(theWord);
        }

        /////// separator 2
        System.out.println("\n");

        /**
         * reverse a string
         */
        String message = "happy holidays"; //syadiloh yppah
        message = message.toUpperCase();
        String[] mesSplit = message.split("");
        for (int i = mesSplit.length-1; i>=0; i--){
            int findD = message.length()-1;
            char dd = message.charAt(findD);
            System.out.print(mesSplit[i]);
        }

//
//        String message = "heii"; //syadiloh yppah
//        message = message.toUpperCase();
//        String[] mesSplit = message.split("");
//        for (int i = mesSplit.length-1; i>=0; i--){
//            int findD = message.length()-1;
//            //System.out.println(findD);
//            char dd = message.charAt(findD);
//            System.out.print(mesSplit[i]);
//        }



    }
}

