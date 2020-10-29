package labs;

import java.util.Scanner;

public class removeSpace {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input string to be cleaned from white spaces...!");

        String inputString = sc.nextLine();

        String stringWithoutSpaces = inputString.replaceAll("here put space, symbol to replace", "");

        System.out.println("Input String : "+inputString);

        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);

        //sc.close();
    }
}
