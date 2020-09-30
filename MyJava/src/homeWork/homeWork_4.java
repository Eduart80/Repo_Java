package homeWork;

import java.util.Scanner;

public class homeWork_4 {
    public static void main(String[] args) {
        /**
         * Create variable to store student-score and total-possible-score;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: less than or equal to 50
         */

        // calculate percentage
        // your percentage: XX.yy and your grade is: A
        double maxScore = 160;
        double studentScore = 140;     //  (score/max)*100
        System.out.println("Your score is: " + studentScore + " points.");

        double studentResult = (studentScore / maxScore) * 100;
        System.out.println("Your percentage is " + studentResult + "%");

        if (studentResult > 90 && studentResult < 100) {
            System.out.println("Grade A");  //Grade B: 90-100
        } else if (studentResult > 81 && studentResult < 90) {
            System.out.println("Grade B"); //Grade B: 81-90
        } else if (studentResult > 71 && studentResult < 80) {
            System.out.println("Grade C"); //Grade C: 71-80
        } else if (studentResult > 61 && studentResult < 70) {
            System.out.println("Grade D"); //Grade D: 61-70
        } else if (studentResult > 51 && studentResult < 60) {
            System.out.println("Grade D"); //Grade E: 51-60
        } else if (studentResult > 0 && studentResult < 50) {
            System.out.println("Grade F"); //Grade F: less than or equal to 50
        } else {
            System.out.println("Wrong entry, please try it again.");
        }

        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         *
         */
        int number = 30;
        if ((number % 3) == 0) {
            System.out.println("divisible by 3");
        } else if ((number % 5) == 0) {
            System.out.println("divisible by 5");
        } else if ((number % 3) == 0 && (number % 5) == 0) {
            System.out.println("divisible by 3 and 5 ");
        } else {
            System.out.println("Try it again, you entered #" + number);
        }

        /**
         * Checking car mode (P, D, N, R)   // switch
         * if car mode is P and "you can park car"
         * if car mode is D drive car
         *      if drive type is Snow, display "You are on Snow mode"
         *      if drive type is Sport, display "You are on Sport mode"
         *      if drive type is Eco, display "You are on Eco mode"
         * if car mode is N you can "put car in car wash"
         * if car mode is R you can "revere the car"
         */

        String one = "Snow";
        String two = "Sport";
        String three = "Eco";

        String cMode = "Eco";  // Snow, Sport or Eco
        String carGearON = "D";
        switch (carGearON){
            case "P":
                System.out.println("You can park the car");
                break;
            case "D":
                if (cMode == one){
                    System.out.println("You are on "+one+" mode");
                }else if (cMode == two){
                    System.out.println("You are on "+two+" mode");
                }else if (cMode == three) {
                System.out.println("You are on "+three+" mode");
                }
                break;
            case "N":
                System.out.println("Put car in car wash");
                break;
            case "R":
                System.out.println("Reverse the car");
                break;
        }
        ///////////////////////////////////////////////////
        //
        String carName = "BMW";
        System.out.println(carName);
        String[] myMode = new String[3];
        myMode[0] = "Snow";
        myMode[1] = "Sport";
        myMode[2] = "Eco";
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome, select mode: "+"\n"+"1 for Snow"+"\n"+"2 for Sport"+"\n"+"3 for Eco");
        byte selected = input.nextByte();
        if (selected == 1){
            System.out.println("Car mode selected Snow.");
        }else if (selected == 2){
            System.out.println("Car mode selected Sport.");
        }else if (selected == 1){
            System.out.println("Car mode selected Eco.");
        }
        Scanner gearInput = new Scanner(System.in);
        System.out.println("Select gear (P, D, N, R)");
        String gearSelected = input.next();
        gearSelected = gearSelected.toUpperCase();

        switch (gearSelected){
            case "P":
                System.out.println("You can park the car");
                break;
            case "D":
                if (selected == 1){
                    System.out.println("Drive mode "+myMode[0]+", please drive careful");
                }else if (selected == 2){
                    System.out.println("You are driving in "+myMode[1]+" mode");
                }else if (selected == 3) {
                    System.out.println("You are driving in "+myMode[2]+" mode");
                }
                break;
            case "N":
                System.out.println("Put car in car wash");
                break;
            case "R":
                System.out.println("Reverse the car");
                break;
        }
        System.out.println("Be safe, don't Text and Drive");



    }
}
