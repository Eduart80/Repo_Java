package Interview;

import java.util.Arrays;

public class reversString {
    public static void main(String[] args) {
        String name = "dog";
        System.out.println(revers(name));

    }
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
