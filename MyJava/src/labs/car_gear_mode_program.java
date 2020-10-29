package labs;

import java.util.Scanner;

public class car_gear_mode_program {
    public static void main(String[] args) {
        String carName = "BMW";
        System.out.println(carName);
        String[] myMode = new String[3];
        myMode[0] = "Snow";
        myMode[1] = "Sport";
        myMode[2] = "Eco";
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome, select mode: "+"\n"+"1 for Snow"+"\n"+"2 for Sport"+"\n"+"3 for Eco");
        byte selected = input.nextByte();
            if (selected == 1){
                System.out.println("Car mode selected Snow.");
            }else if (selected == 2){
            System.out.println("Car mode selected Sport.");
            }else if (selected == 1){
            System.out.println("Car mode selected Eco.");
            }
        Scanner gearInput = new Scanner(System.in);
        System.out.println("Select gear (P, D, N, R)");
        String gearSelected = input.next();
        gearSelected = gearSelected.toUpperCase();
        switch (gearSelected){
            case "P":
                System.out.println("You can park the car");
                break;
            case "D":
                if (selected == 1){
                    System.out.println("Drive mode "+myMode[0]+", please drive careful");
                }else if (selected == 2){
                    System.out.println("You are driving in "+myMode[1]+" mode");
                }else if (selected == 3) {
                    System.out.println("You are driving in "+myMode[2]+" mode");
                }
                break;
            case "N":
                System.out.println("Put car in car wash");
                break;
            case "R":
                System.out.println("Reverse the car");
                break;
        }
        System.out.println("Be safe, don't Text and Drive");
    }
}
