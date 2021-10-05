package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
//        arr.add(769082435);
//        arr.add(210437958);
//        arr.add(673982045);
//        arr.add(375809214);
//        arr.add(380564127);
        arr.add(7);
        arr.add(69);
        arr.add(2);
        arr.add(221);
        arr.add(8974);

        Collections.sort(arr);  /// key is to sort them first

        long num1 = 0L;
        long num2 =0L;

        for(int i=0; i<arr.size()-1;i++){
            num1 = num1 + (long)arr.get(i);
        }
        for(int j=1; j< arr.size();j++){
            num2 = num2 + (long)arr.get(j);
        }
        System.out.print((num1 < num2) ? num1 +" "+num2 : num2 +" "+num1);
    }

}

