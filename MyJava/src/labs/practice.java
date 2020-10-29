package labs;

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        //question 1
        Scanner userInput = new Scanner(System.in);
        System.out.print("Your  name ? ");  //print method use the same line to right input

        String emptyArea = userInput.nextLine().trim();  //Trim is to remove the space in front of the text input
        System.out.println("hi there: " + emptyArea);

        //question 2
        Scanner askForAge = new Scanner(System.in);
        System.out.print("How old are you: "); //print method use the same line to right input

        Byte userAgeOut = askForAge.nextByte();
        System.out.println("Ok, got it: " + userAgeOut);

        //question 3
        Scanner userHeight = new Scanner(System.in);
        System.out.print( "Your height: ");

        String userInputHeight = userHeight.nextLine();
        System.out.println("Is this Feet (F) or Meter(M) ? ");

        //question 4
        Scanner userAnswer = new Scanner(System.in);
        System.out.print( " ");

        String userAnswer2 = userAnswer.nextLine().trim();  //Trim is to remove the space in front of the text input
        System.out.println("Ok,.. " + userAnswer2);



    }
}
