package practice;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class PlusMinus {
    public static void main(String[] args) {
        /**
         * Given an array of integers, calculate the ratios of its elements
         * that are positive, negative, and zero. Print the decimal value
         * of each fraction on a new line with  places after the decimal.
         */

        List<Integer> arr =new ArrayList<Integer>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);

        float neg = 0;
        float  pos = 0;
        float  zero = 0;

        for( int i=0;i< arr.size();i++){
            if (arr.get(i) < 0){
                neg++;
            }
            else if (zero == 0){
                zero++;
            }
            else{
                pos++;
            }
        }
        String pp2 = format("%.6f", pos/arr.size());
        String dd1 = format("%.6f", neg/arr.size());
        String pp3 = format("%.6f", zero/arr.size());

        System.out.println(pp2);
        System.out.println(dd1);
        System.out.println(pp3);
    }

}
