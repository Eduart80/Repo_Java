package labs;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {

        /*   old if-else operator
        if(condition) {
            Statement-1(blablabla);
        }
        else {
            Statement-2(String-blabla);
        }
        */
        Scanner u1 = new Scanner(System.in);
        System.out.print("Choose a number from 0 to 100  ");

        byte userin = u1.nextByte();
        System.out.println("Ok, lets see " + userin);
        byte num = userin;
        if( num < 50 ){
            System.out.println("you lost, try it again.");
        }
        else {
            System.out.println("You won!");
        }

        /*  new how to do if-else operator
            datatype varName = condition?statement-1:statement-2;
         */
        Scanner num1 = new Scanner(System.in);
        System.out.print("How much is the fish ? ");

        int userIn2 = num1.nextInt();
        String userOut = userIn2<50?"This is cheap fish.":"This is very expensive.";

        System.out.println(userOut);

    }
}
