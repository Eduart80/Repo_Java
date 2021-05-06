package aside;

import java.util.Scanner;

public class calculatePayment {
    public static void main(String[] args) {
        System.out.println("Please enter the amount.");
        Scanner inIt = new Scanner(System.in);
        int entry = inIt.nextInt();


        int monthly = entry / 12;
        String monthly2 = Integer.toString(monthly);
        System.out.println(monthly2 + " per months");

        int weekly = (entry / 12) / 4;
        String weekly2 = Integer.toString(weekly);
        System.out.println(weekly2 + " per weeks");

        int perH = (((entry / 12) / 4) / 5) / 8;
        String perH2 = Integer.toString(perH);
        System.out.println(perH2 + " per hours");

///--------------------double------------------------
        System.out.println("Please enter the amount.");
        Scanner inIt2 = new Scanner(System.in);
        double entry2 = inIt2.nextDouble();


        double monthly3 = entry2 / 12;
        String monthly22 = String.format("%.2f",monthly3);
        System.out.println(monthly22 + " per months");

        double weekly3 = (entry2 / 12) / 4;
        String weekly22 = String.format("%.2f",weekly3);
        System.out.println(weekly22 + " per weeks");

        double perH3 = (((entry2 / 12) / 4) / 5) / 8;
        String g = String.format("%.2f",perH3);
        System.out.println(g + " per hours");

    }

}
