package Interview;

public class stringArraysWordCount {

    public static void main(String[] args) {
       // 1 // given an array of strings sentences, count the words
        String[] setA = {"alice and bob love livecode", "i think so too", "this is great thanks very much"};
        splitString(setA);

       // 2 //Given an array of strings words, return the first palindromic string in the array
        String[] words = {"abc","car","ada","racecar","cool"};
        findPolindrome(words);
        // 3 // array of integers nums and have a target
        int[] nums = {2,7,11,15,4,5,};
        int target = 9;
        addValues(nums, target);
        // 4 // for each nums[i] find out how many numbers in the array are smaller than it
        int[] nuum = {8,1,2,2,3};
        findSmaller(nuum);
    }
    // 1
    public static void splitString(String[] input){
        int N = input.length;
        for (int i = 0; i < N; i++){
            String intSplit = input[i];
            String[] splitString = intSplit.split(" ");
            System.out.println("Words a index "+ i + " is " +splitString.length);
        }

    }
    // 2
    public static void findPolindrome(String[] input){
        for (String read : input) {
            String result = new StringBuffer(read).reverse().toString();
            if (read.equals(result)) {
                System.out.println(result);
                break;
            }
        }

    }
    // 3
    static void addValues(int[] numb, int value){

        for (int i = 0; i < numb.length; i++){
            for (int j = 1; j < numb.length ; j++){
               int resole = numb[i] + numb[j];
                if(value == resole){
                    System.out.println("Index "+ i +" and "+ j + " = "+ resole);
                }

            }
        }
    }
    // 4
    static void findSmaller(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            int res = 0;
            for (int j = 1; j < numbers.length; j++) {
                if(numbers[i] > numbers[j]){
                    res++;
                }
            }
            if(res != 0){
                System.out.println("For number " + numbers[i]+" exist "+ res+" smaller numbers than it");
            }else{
                System.out.println("For number " + numbers[i]+" does not exist any smaller number than it");
            }

        }
    }
}