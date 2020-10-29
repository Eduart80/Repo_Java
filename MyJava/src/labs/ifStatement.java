package labs;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {

        /*   old if-else operator
        if(condition) {
            Statement-1(blablabla);
        } else if (condition 2){
            //code
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
        /*
         * if (condition(s)) {
         *      // 1st if block
         * } else if (condition(s)) {
         *      // 2nd if block
         * } else {
         *      // else block
         * }

        int num = 121;
        if ((num%2)==0){
            System.out.println("yes is even" );
        }else{
            System.out.println("try agin");
        }*/
        String name = "Happy";
        boolean result2 = true;
        int number2 = 22;
        /**
         * if name length is greater than 10 and number is greater than 5
         * print the below:
         *      name in all uppercase
         *      and replace p with b in name
         * else
         * make result as false
         *
         *
         * sout(result) // outside the if-else block
         */
        String name1 = "Happy";
        boolean result = true;
        int number = 22;

        if (name.length()>10 && number>5){
            name1.toUpperCase().replace("p", "p");

        }else {
            result=false;
        }
        System.out.println(result);  //is outside if-else

    }
}
