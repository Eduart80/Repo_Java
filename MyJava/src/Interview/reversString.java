package Interview;

import java.util.Arrays;

public class reversString {
    public static void main(String[] args) {
        String name = "dog";
        System.out.println(revers(name));
        String tech1 = "String revers automatic";
        System.out.println( "Auto :"+ stringRevers(tech1));
        System.out.println("Manual :"+ stringManual(tech1));
    }
    // Automatic , faster
    public static String stringRevers(String name){
        return new StringBuilder(name).reverse().toString();
    }
    // Manual
    public static String stringManual(String name){
        StringBuilder sr = new StringBuilder();
        for(int i = name.length()-1; i >= 0; i--){
            sr.append(name.charAt(i));
        }
        return sr.toString();
    }
    // Une kur mesoja java prog.
    public static String revers(String n){
        char[] d = new char[n.length()];
        int indexOfString = 0;
        for(int i = n.length()-1; i>=0 ; i--){
            d[indexOfString] = n.charAt(i);
            indexOfString++;
        }
        System.out.println("middle "+ Arrays.toString(d));  //output as array

        String res = "";
        for(int i= 0; i< n.length();i++){
            res = res + d[i];
        }
        return res;  // output as string
    }



}
