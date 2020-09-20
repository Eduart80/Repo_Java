package Java_Class;

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
        //(++) increment has post-increment and pre-increment
        //post is abc++
        //pre is ++abc
        //same with decrement (--)
        int abc = 2;
        abc++;
        System.out.println("post-inc "+ abc);
        System.out.println("post-inc "+ abc++);
        System.out.println("post-inc "+ abc++);

        int abc1 = 2;
        ++abc1;
        System.out.println("pre-inc "+ abc1);

        int abc2 = 2;
        abc2--;
        System.out.println("post-decrement "+ abc2);

        int abc3 = 2;
        --abc3;
        System.out.println("pre-decrement "+ abc3);
        System.out.println("post-inc "+ --abc3);
        System.out.println("post-inc "+ --abc3);





    }
}
