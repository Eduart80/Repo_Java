package classTest;

public class myMain {
    public static void main(String[] args) {
        myMethods a1 = new myMethods();

        ////   1
        int[] array= {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int number = 24;
       a1.findDelete(array, number);

       ////   2
        int[] arr = {1, 3, 5, 4, 6, 8};
        a1.findMissing(arr);

        /// 3
        int userspeed = 166;
        a1.speed(userspeed);
        a1.points(userspeed);



    }
}


/**
 * Question 3:
 * Scenario: Traffic ticketing system
 * Write a method, that will print (not return) the points charged against
 * the license for over speeding.
 *
 *    1. Speed Limit = 70
 *    2. Every 5 miles over the speed limit will add 1 point
 *    3. If user gets 12 points for a speed then license is suspended
 *
 *  Example:
 *      user speed = 74 ; 0 points
 *      user speed = 78 ; 1 points  // 70-75(1) 75-78(0) = 1
 *      user speed = 88 ; 3 points  // 70-75(1) 75-80(1) 80-85(1) 85-88(0) = 3
 *      user speed = 178 ; 21 points (License suspended).
 *      user speed = 70 ; Thank you for driving within the speed limit.
 *
 */