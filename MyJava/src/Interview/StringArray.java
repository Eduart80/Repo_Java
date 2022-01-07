package Interview;

import java.util.Scanner;

public class StringArray {
    /**
     * Given a string, , matching the regular expression [A-Za-z !,?._'@]+,
     * split the string into tokens. We define a token to be one or more
     * consecutive English alphabetic letters. Then, print the number of tokens,
     * followed by each token on a new line.
     *
     * Note: You may find the String.split method helpful in completing this challenge.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] entry = s.split("[ !,?._'@\\s]+");
        System.out.println(entry.length);
        for(String res : entry){
            System.out.println(res);
        }
        scan.close();
    }
}
