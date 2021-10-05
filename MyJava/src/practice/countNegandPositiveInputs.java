package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


// input [1,2,3,4,5]
// size of 5
public class countNegandPositiveInputs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
class Result {
    public static void plusMinus(List<Integer> arr) {

        int positive = 0;
        int negative = 0;
        int zero = -1;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                positive = positive + arr.get(i);

            } else if (arr.get(i) == 0) {
                zero = 0;
            } else {
                negative = negative - arr.get(i);
            }
        }
        double sum = (double) positive / 2;
        String outP = String.format("%.6",sum);
        System.out.println(outP);


    }
}