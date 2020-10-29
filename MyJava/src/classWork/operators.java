package classWork;

public class operators {
    public static void main(String[] args) {

        /*
        Operators
         * Assignment operator (=)
         * Arithmetic operator (=, -, +, /, *, % Modulus, ++, -- )
         * Comparison operator (>, <, >=, <=, ==, != not-equal )
         *
         * Logic operator ( && end, || or , ! not)
         *
         */

/////// Arithmetic operator (=, -, +, /, *, % Modulus, ++, -- )

        //(++) increment has post-increment and pre-increment
        //post is abc++
        //pre is ++abc
        //same with decrement (--)
        int abc = 2;
        abc++;
        System.out.println("none-inc "+ abc++);
        System.out.println("post-inc "+ abc++);
        System.out.println("post-inc "+ abc++);
        System.out.println("Advance assignment "+(abc+=4));

        int abc1 = 4;
        ++abc1;
        System.out.println("pre-inc "+ abc1);

        int abc2 = 6;
        abc2--;
        System.out.println("post-decrement "+ abc2);

        int abc3 = 8;
        --abc3;
        System.out.println("pre-decrement "+ abc3);
        System.out.println("post-inc "+ --abc3);
        System.out.println("post-inc "+ --abc3);

        // % Modulus operator
        int dividable = 9;
        int dividable2 =10;
        System.out.println("can i divide "+dividable+" by 2 - "+(dividable % 2 == 0));
        System.out.println("can i divide "+dividable2+" by 2 - "+(dividable2 % 2 == 0));

//////// Comparison operator (>, <, >=, <=, ==, != not-equal )

        //( != ) not equal , will revers the value
        int fish = 15;
        int bread = 30;
        boolean finalPrice = !(fish >= bread && fish == bread);  //  = ! ( value );
        System.out.println("Not-equal revers result is: "+finalPrice);









    }
}
