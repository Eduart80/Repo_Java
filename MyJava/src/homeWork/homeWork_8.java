package homeWork;

import labs.aamethod;

import java.util.Scanner;

public class homeWork_8 {

    public static void main(String[] args) {
        ////link to methods
        methodForHomeWork_8 a1 = new methodForHomeWork_8();

        // start
        System.out.println("Hello, please select printing options.");
        System.out.println("Type (S) Single page or (D) Double page");

        //select single or double
        Scanner entry = new Scanner(System.in);
        char c = entry.next().charAt(0);
        if (c == 's'){

            //printer status
            a1.Levels();
            Scanner input = new Scanner(System.in);
            System.out.print("Enter pages : ");
            int input2 = input.nextByte();
            System.out.println("Printing...");

            a1.userPageUsed(input2);
            a1.userInkUsed(input2);
            //status
            if(a1.toner<=0){
                Scanner inputInk = new Scanner(System.in);
                System.out.println("Enter it now...");
                int input3 = input.nextByte();
                a1.inkFill(input3);
            }

            a1.Levels();
        }
        ///// double selection
        else if (c == 'd'){
            a1.Levels();
            //enter page to print
            Scanner input = new Scanner(System.in);
            System.out.print("Enter pages : ");
            int input2 = input.nextByte();
            System.out.println("Printing...");
            a1.userPageUsed(input2);
            a1.userInkDouble(input2);
            //status
            if(a1.toner<=0){
                Scanner inputInk = new Scanner(System.in);
                System.out.println("Enter it now...");
                int input3 = input.nextByte();
                a1.inkFill(input3);
            }
            a1.Levels();
        }

    }

}
