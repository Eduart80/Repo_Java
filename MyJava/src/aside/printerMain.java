package aside;

import labs.aamethod;
import java.util.Scanner;

public class printerMain {
    /// Printer program
    public static void main(String[] args) {
        ////link to methods
        printerMethods a1 = new printerMethods();

        // start
        System.out.println("Hello, please select printing options.");
        a1.Levels();
            // if no ink or paper
                if(a1.toner<=10){
                    Scanner inputInk = new Scanner(System.in);
                    System.out.println("Ink low, do you want to continue? (Y), (N)");
                    char Y = inputInk.next().charAt(0);
                    if(Y == 'y'){
                        //enter ink
                        a1.inkUpdate();
                        Scanner inputInk2 = new Scanner(System.in);
                        System.out.println("Enter value: ");
                        int input5 = inputInk2.nextByte();
                        a1.inkFill(input5);
                    }
                }
                ///Paper fill
                    if(a1.page<=0){
                        Scanner inputPaper1 = new Scanner(System.in);
                        System.out.println("No more paper, do you want to refill? (Y), (N)");
                        char Y = inputPaper1.next().charAt(0);
                        if(Y == 'y'){
                            //enter paper
                            a1.paperUpdate();
                            Scanner inputPaper3 = new Scanner(System.in);
                            System.out.println("Enter paper: ");
                            int input4 = inputPaper3.nextByte();
                            a1.paperFill(input4);
                        }
                    }

        //select single or double
        System.out.println("Type (S) Single page or (D) Double page");
        Scanner entry = new Scanner(System.in);
        char c = entry.next().charAt(0);
        if (c == 's'){

            //printer status
            Scanner input = new Scanner(System.in);
            System.out.print("Enter pages to print: ");
            int input2 = input.nextByte();
            System.out.println("Printing...");

            a1.userPageUsed(input2);
            a1.userInkUsed(input2);

            //status toner
            if(a1.toner<=0){
                Scanner inputInk = new Scanner(System.in);
                System.out.println("Enter it now... (Y), (N)");
                char Y = entry.next().charAt(0);
                if(Y == 'y'){
                    //enter toner
                    a1.inkUpdate();
                    Scanner inputInk8 = new Scanner(System.in);
                    System.out.println("Enter value: ");
                    int input7 = inputInk8.nextByte();
                    a1.inkFill(input7);
                }
            }
            ///Paper fill
            if(a1.page<=0){
                Scanner inputPaper = new Scanner(System.in);
                System.out.println("No more paper, do you want to refill? (Y), (N)");
                char Y = entry.next().charAt(0);
                if(Y == 'y'){
                    //enter paper
                    a1.paperUpdate();
                    Scanner inputInk9 = new Scanner(System.in);
                    System.out.println("Enter value: ");
                    int input4 = input.nextByte();
                    a1.paperFill(input4);
                }else {
                    System.out.println("Have a good day.");
                }
            }
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

            //status toner
            if(a1.toner<=0){
                Scanner inputInk = new Scanner(System.in);
                System.out.println("Enter it now... (Y), (N)");
                    char Y = entry.next().charAt(0);
                    if(Y == 'y'){
                        //enter toner
                        a1.inkUpdate();
                        Scanner inputInk8 = new Scanner(System.in);
                        System.out.println("Enter value: ");
                        int input7 = inputInk8.nextByte();
                        a1.inkFill(input7);
                    }
            }

            ///Paper fill
            if(a1.page<=0){
                Scanner inputInk = new Scanner(System.in);
                System.out.println("No more paper, do you want to refill? (Y), (N)");
                char Y = entry.next().charAt(0);
                if(Y == 'y'){
                    //enter paper
                    a1.paperUpdate();
                    Scanner inputInk1 = new Scanner(System.in);
                    System.out.println("Enter value: ");
                    int input4 = input.nextByte();
                    a1.paperFill(input4);
                }else {
                    System.out.println("Have a good day.");
                }
            }
            a1.Levels();
        }

    }
}