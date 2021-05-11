package sampleWork;

import java.util.Arrays;
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        String messageOne = "Find my time in the past and in the future.";  //
        String[] messSplit = messageOne.split(" ");
        System.out.println(Arrays.toString(messSplit));
        int messLength = messSplit.length;
        System.out.println(messLength);

        //input to method int addToo
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        int input2 = input.nextInt();
        int restore = addToo(input1, input2);
        System.out.println(restore);

        /////////
        int[] arr = {'2', '3', '8'};
        fillArray(arr);
    }///end of Main method

    public static int addToo(int input1, int input2) {
        int result = input1 + input2;
        return result;
    }

    public static void fillArray(int[] arr) {
        int num = (arr[0] + arr[1] + arr[2]) / 2;
        System.out.println(num);
    }
}
//    public static void arrayAvg(int[] arr) {
//        // write code to find average
//        // Decide on the return type
//        // 22, 11, 33, 44, 55
//        // add all / total number
//    }
//////////////////////////////////////////////////////////

