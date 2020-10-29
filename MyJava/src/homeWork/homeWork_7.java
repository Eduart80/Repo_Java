package homeWork;

import java.util.Scanner;

public class homeWork_7 {

    public static void main(String[] args) {
        ///connection method link
        classMethod a1 = new classMethod();

        ///// first   int
        int[] note = {230, 440, 1012, 88, 90};
        double thought = a1.myMath(note);
        System.out.println("first int -> " + thought);

        //Second   double
        double[] value = {1.1, 0.25, 0.56, 8.09};
        double outvalue = a1.myMath2(value);
        System.out.println("second double -> " + outvalue);

        /*  2. Create a method to verify if the input-int-number is prime or not
         * prime number: number divisible by 1 and itself
         *  prime numbers: 2, 3, 5, 7, 11
         * 21 -> not a prime
         *
         * user input  int
         * if (boolean = number is / by 1 and number / user input)
         * if yes , say this is a prime number
         * if not , this is not prime
         */
        //////user input
        Scanner user = new Scanner(System.in);
        int userEntry = user.nextInt();
        if ((userEntry / 1 / userEntry) == 1 ){
            System.out.println("Yes, this number is prime.");
        }else {
            System.out.println("Sorry, not a prime number.");
        }
        /** 3. Create a method to find if given string is palindrome.
         * Palindrome: string which reads the same in reverse.
         * racecar  ->  racecar
         * level    ->  level
         */
        String phrase = "DOG";
        System.out.println("Message before "+phrase);
        String rev = "";
        String[] phraseSplit = phrase.split("");
        for(int i=phraseSplit.length-1; i>=0 ; i--){
            rev = rev + phraseSplit[i].charAt(0);
        }
        System.out.println("Message reversed "+rev);
        /*
         * 4. Write a method to print(no return) the duplicate values in a given String array.
         * Input String array -> {"hello", "peace", "happy" , "hello", "Happy", "hello"}
         * Method should print -> hello, happy
         * hello
         * happy
         */
        String[] array = {"hello", "peace", "happy", "n" , "hello", "Happy", "hello","ball"};
        String input = "hello, happy , n";
        System.out.println("NAME FOUND: ");
        a1.findDub(array , input);

        ///////// separator
        System.out.println("\n");
        /*
         * 5. Write a method to print(no return) the common values between two arrays (string arrays)
         * Input arrays:
         *  arr1 -> {"hello", "peace", "happy" , "hello", "Happy", "hello", "laugh"}
         *  arr2 -> {"hello", "grow", "laugh" , "peace"}
         * Method should print -> hello, peace, laugh
         * hello
         * peace
         * laugh
         */

        String[] arr1 = {"start", "peace", "happy" , "hello", "Happy", "hello", "laugh"};
        String[] arr2 = {"hello", "grow", "laugh" , "peace","end"};
        String find = "start, peace, laugh, end";
        System.out.println("NAME FOUND: ");
        a1.findArrays(arr1, arr2, find);
        String[] add = arr1;
        a1.findArrays2(add, find);

    }
}