package practice;

import java.util.ArrayList;
import java.util.List;

public class arraySum {
    public static void main(String[] args) {
        List<Integer> arr =new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(10);
        arr.add(11);
        System.out.println(simpleSum(arr));
    }
    public static int simpleSum(List<Integer> ar) {
        int arrA = 0;

        for (int i = 0; i < ar.size(); i++) {
            arrA = arrA + ar.get(i);
        }

        return arrA;
    }
}
