package group_4_Project;

import java.util.Scanner;

public class methods {
    shopOwner_1 ext = new shopOwner_1();
    boolean exit;

    public void runMenu(){
        printHeader();
        while (!exit){
            printMenu();
            int choice = getInput();
            performAction(choice);
        }
    }
    protected void printHeader(){
        System.out.println("Welcome");
        System.out.println("Group 4 project");
    }
    protected void printMenu(){
        System.out.println("Select choice:");
        System.out.println("1. Mall Owner");
        System.out.println("2. Shop Owner");
        System.out.println("3. Client");
        System.out.println("0. Exit to main menu.");
    }
    protected int getInput(){
        Scanner in = new Scanner(System.in);
        int choice = -1;
        while (choice<0 || choice> 3){
            try {
                System.out.print("\nEnter choise: ");
                choice = Integer.parseInt(in.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Invalid entry, please try again.");
            }
        }return choice;
    }
    protected void performAction(int choice){
        switch (choice){
            case 0: exit=true;
                System.out.println("You are in main.");
                break;
            case 1: System.out.println("Hi, my name is ");
                break;
            case 2:
                System.out.println(ext.checkCondition());
                break;
            case 3:
                System.out.println("Costumer");
                break;
            default:
                System.out.println("Unexpected error ");
                break;
        }
    }


}
