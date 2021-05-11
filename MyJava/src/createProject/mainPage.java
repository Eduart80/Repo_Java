package createProject;

import java.util.Scanner;

public class mainPage {
    public static void main(String[] args){
        Menu();
    }
    static boolean exit;
    static menu1 m1 = new menu1();
    static menu2 m2 = new menu2();
    static menu3 m3 = new menu3();

    public static void Menu(){
        while (!exit){
            printMenu();
            int choice = getInput();
            performAction(choice);
        }
    }
    public static void printMenu(){
        System.out.println("Main menu start");
        System.out.println("1. Menu1");
        System.out.println("2. Menu2");
        System.out.println("3. Menu3");
        System.out.println("0. To exit");
    }
    public static int getInput(){
        Scanner in = new Scanner(System.in);
        int choice = -1;
        while (choice<0 || choice >3){
            try {
                System.out.println("Enter choice: ");
                choice = Integer.parseInt(in.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Invalid, try again.");
            }
        }return choice;
    }
    public static void performAction(int choice){
        switch (choice){
            case 0: exit=true;
                System.exit(0);
                break;
            case 1:
                //menu 1
                m1.insideIt();
                break;
            case 2:
                //menu 2
                m2.insideIt();
                break;
            case 3:
                //menu 1
                m3.insideIt();
                break;
            default:
                Menu();
                break;
        }
    }

}
