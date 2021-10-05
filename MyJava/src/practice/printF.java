package practice;

import java.util.Scanner;

public class printF {
    /**
     * "%-15s" means that within 15 blank space,
     * the String "s1" will be filled in the left.
     * (fill in the blanks from the left) "%03d" means that within 3 0s,
     * the integer"x" will be filled in the right.
     * (fill in the zeros from the right).
     * This can only be done by using printf method
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);

        }
        System.out.println("================================");

    }
}
