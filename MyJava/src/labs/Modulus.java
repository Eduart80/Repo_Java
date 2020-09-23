package labs;

import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {

        Scanner pro = new Scanner(System.in);
        System.out.print("Modulus formula: enter # ");
        int proIn = pro.nextInt();
        System.out.println("ok-: "+proIn);
        int a1 = proIn;


        Scanner pro2 = new Scanner(System.in);
        System.out.print("Divided by #  ");
        int proIn2 = pro.nextInt();
        //System.out.println("ok-: ");
        int a2 = proIn2;

        int a3 = a1 % a2;
        String result = a3==0?"Yes, is dividable. ":"No, can not divide this number equally.";

        System.out.println(result);

    }
}
