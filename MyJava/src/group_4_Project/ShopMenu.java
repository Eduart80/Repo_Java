package group_4_Project;

import group_4_Project.shop_2.shopOwner2;
import group_4_Project.shop_3.shopOwner3;
import group_4_Project.shop_4.shopOwner4;
import group_4_Project.shop_5.shopOwner5;
import group_4_Project.shop_NewEntry.shopOwner_1;

import java.util.Scanner;

public class ShopMenu {
    public static void main(String[] args) {
       runMenu();


    }/// end of main

    static boolean exit;
    static shopOwner_1 x1 = new shopOwner_1();
    static shopOwner2 x2 = new shopOwner2();
    static shopOwner3 x3 = new shopOwner3();
    static shopOwner4 x4 = new shopOwner4();
    static shopOwner5 x5 = new shopOwner5();
    static requestAShop b1 = new requestAShop();


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
        System.out.println("\tSelect choice:");
        System.out.println("1. Request to open a new shop");
        System.out.println("2. Mall Announcements ");
        System.out.println("3. New Shop");
        System.out.println("4. shop TopShop");
        System.out.println("5. shop Shoes");
        System.out.println("6. shop PhoneShop");
        System.out.println("7. shop Candy");
        System.out.println("0. Exit program");
    }
    protected static int getInput(){
        Scanner in = new Scanner(System.in);
        int choice = -1;
        while (choice<0 || choice> 7){
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
                System.out.println("\n\tGoodBye");
                System.exit(0);
                break;
            case 1: // to mall request
                    x1.toOpenShop();
                break;
            case 2: //to mall
                System.out.println("\nMall");
                break;
            case 3: // to new shop
                System.out.println("New shop");
                x1.shopMain();
                break;
            case 4: //shop 2
                System.out.println("\nShop 2");
                x2.shopMain2();
                break;
            case 5: // shop 3
                System.out.println("\nShop 3");
                x3.shopMain3();
                break;
            case 6: //shop 4
                System.out.println("\nShop 4");
                x4.shopMain4();
                break;
            case 7: // shop 5
                System.out.println("\nShop 5");
                x5.shopMain5();
                break;
            default: //error
                System.out.println("Unexpected error ");
                break;
        }
    }

}
