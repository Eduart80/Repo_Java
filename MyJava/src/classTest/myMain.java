package classTest;

import java.util.Arrays;

public class myMain {
    public static void main(String[] args) {
        myMethods a1 = new myMethods();

        ////   1
        int[] array= {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int number = 24;
        a1.findDelete(array, number);
        a1.findDelete1(array,number);

       ////   2
        int[] arr = {5,1, 4,2, 7,3};
        System.out.println("Missing number is "+ a1.findMissing(arr));
        a1.findMissing1(arr);

        /// 3
        int userspeed = 85;
        a1.speed(userspeed);
        a1.points(userspeed);

        test3 ne = new test3();
        System.out.println( ne.isSpecial("from other "));

        int[] a={2,3};
        int[] b= {4,5};
        System.out.println(Arrays.toString(ne.merge(a, b)));


    }
}