package lab;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {

        Scanner userHeight = new Scanner(System.in);
        System.out.print("what is your height: ");

        double userAgeOut = userHeight.nextDouble();
        System.out.println("Ok, got it: " + userAgeOut);

        String userInputHeight = userHeight.nextLine();
        System.out.println("Is this Feet (F) or Meter(M) ? ");

        //question 4
        Scanner userAnswer = new Scanner(System.in);
        System.out.print( " ");

        String userAnswer2 = userAnswer.nextLine().trim();  //Trim is to remove the space in front of the text input
        System.out.println("Ok, - " + userAnswer2);

        String stock = "userAnswer2";
        if ( stock.contains("m, M") ) {
            //convert to meter  // || userAnswer2.contains("f, F")
            double feetInMeter = 3.2808;  //ft =m * 3.2808 // m = ft/3.2808
            double inMeter = userAgeOut / feetInMeter;
            System.out.println("Ok, you are " + inMeter + " metre");

          /*
            // convert in feet
            double feetInMeter = 3.2808;
            double inMeter = userAgeOut * feetInMeter;
            System.out.println("Ok, you are " + inMeter + "metre");
            *
           */
        }
         else  {
            System.out.println("Ma man, look at you - " + userAgeOut + " feet");
        }
        /*if(condition) {
            Statement(s);
        }
        else {
            Statement(s);
        }

        Scanner u1 = new Scanner(System.in);
        System.out.print("Choose your number from 0 to 100  ");

        double userin = u1.nextDouble();
        System.out.println("Ok, lets see " + userin);
        double num = userin;
        if( num < 50 ){
            System.out.println("you lost, try it again.");
        }
        else {
            System.out.println("You won!");
        }*/

    }
}
