package practice;

import java.util.Arrays;

public class practice1 {
    
    public static void findMe(int[] numb){
        int firstP = 0;
        boolean foundPerfect = false;
        int num = 0;
        for (int i=0; i<=20;i++){
            num = i * i;
            for (int j : numb) {
                if (num == j) {
                    foundPerfect = true;
                    firstP = j;
                    break;
                }
            }
            if(foundPerfect){
               break;
            }
        }
        System.out.println(firstP);

    }

    public static void findVowels2(String[] line){
        int count = 0;
        char[] aa = {'a','e','i','o','u'};
        for(int i=0; i<line.length;i++){
            if(line[i].charAt(0)== 'a'|| line[i].charAt(0)== 'e'|| line[i].charAt(0)== 'o'|| line[i].charAt(0)== 'u'|| line[i].charAt(0)== 'i') {
                count++;
            }
        }
        System.out.println(count);
    }
    public static int vowels(char[] array) {
        int y = 0;
        for (char x : array) {
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'y')
                y++;
        }
        return y;
    }
    public static int vowels (String[] alpha){
        int[] count = new int[alpha.length];
        int max = 0;
        for (String temp : alpha) {
            for (int j = 0; j < temp.length(); j++) {
                char x = temp.charAt(j);
                if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                    System.out.print(x);
                }
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] numbers = {111, 54, 64 , 98, 33, 11 , 10, 88};
        int[] numb = {111, 32, 90, 54, 64, 1, 11, 82, 91, 25};
        String statement = "you have a great day ahead ";
        String[] stSplit = statement.split("");
        System.out.println(Arrays.toString(stSplit));
        findVowels2(stSplit);
        findMe(numb);
        System.out.println("from "+vowels(stSplit));

    }
}
