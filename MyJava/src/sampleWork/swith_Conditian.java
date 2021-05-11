package sampleWork;

import java.util.Scanner;

public class swith_Conditian {
    public static void main(String[] args) {
        /**
         * based on month name, print season
         * dec, jab, feb -> winter
         * mar, apr, may -> summer
         * jun, jul, aug -> fall
         * sep, oct, nov -> spring
         * if invalid monthName, print invalid month entered
         */

        Scanner input = new Scanner(System.in);
        System.out.print("What month is now: ");

        String userInput = input.next();        //case sensitive
        switch (userInput.toLowerCase()) {
            case "december":
            case "january":
            case "february":
                System.out.println("winter");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("summer");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("fall");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("spring");
                break;
            default:
                System.out.println("Wrong entry, try it again.");
                break;
        }
    }
}
