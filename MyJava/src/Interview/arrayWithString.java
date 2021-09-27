package Interview;

import java.util.HashSet;
import java.util.Set;

public class arrayWithString {

    public static void main(String[] args) {

        char[] arr = {'a','b','c'};
        String sample = "abcdfgabcdqweabdd";

        System.out.println(  findSolution(arr, sample));

    }
    static String findSolution(char[] c, String name){

        String[] cc = name.split("");
        Set nam = new HashSet();
        for(int i=0; i< cc.length; i++){
            if (!nam.contains(i)){
                nam.add(i);
            }
            //nam.add(name.charAt(i));
        }



        return String.valueOf(nam);
    }




}
