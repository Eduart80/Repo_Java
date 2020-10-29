package group_4_Project;

import java.util.Scanner;

public class mainMenu {
    public static void main(String[] args) {
       runMenu();




    }/// end of main

    static boolean exit;
    static shopOwner_1 a1 = new shopOwner_1();

    public static void runMenu(){
        printHeader();
        while (!exit){
            printMenu();
            int choice = getInput();
            performAction(choice);
        }
    }
    protected static void printHeader(){
        System.out.println("Welcome Group 4 project");
    }
    protected static void printMenu(){
        System.out.println("Select choice:");
        System.out.println("1. Request to open a new shop");
        System.out.println("2. Mall Owner");
        System.out.println("3. Shop Owner");
        System.out.println("4. Client");
        System.out.println("0. Exit");
    }
    protected static int getInput(){
        Scanner in = new Scanner(System.in);
        int choice = -1;
        while (choice<0 || choice> 4){
            try {
                System.out.print("Enter choice: ");
                choice = Integer.parseInt(in.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Invalid entry, please try again.");
            }
        }return choice;
    }
    protected static void performAction(int choice){
        switch (choice){
            case 0: exit=true;
                System.out.println("\nYou are in main.");
                break;
            case 1: // to mall request
                requestAShop b1 = new requestAShop();
                    b1.toOpenShop();
                break;
            case 2: //to mall
                System.out.println("\nMall");
                break;
            case 3: // to shop
                a1.shopMain();
                break;
            case 4: //costumer
                a1.information(); //info from shop owner field vars
                break;
            default: //error
                System.out.println("Unexpected error ");
                break;
        }
    }

}
