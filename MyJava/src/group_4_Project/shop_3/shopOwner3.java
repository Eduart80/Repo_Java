package group_4_Project.shop_3;

import group_4_Project.ShopMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class shopOwner3 {

    protected String firstName = "Bob";
    protected String lastName = "Bravo";
    public String password = "33";
    protected String shopName = "Shoes";
    protected int account = 3003;
    protected boolean shopOpen = true;

    //methods connection
    name_Pass_3 aa3 = new name_Pass_3();
    shopStock3 bb3 = new shopStock3();

    private static boolean exit;

    //start in shop by owner
    public void shopMain3() {
        System.out.println("Name is "+ aa3.pRead());
        System.out.println("pass is: "+ aa3.pReadP());
        if(!shopOpen){  // If shop is true continue , if not return to Main
            return;
        }
        // enter user and password
        try{
            int isTru = 0;
            for(int i=0;i<=2;i++) {
                Scanner sh = new Scanner(System.in);
                System.out.println("Enter user Name");
                String a = sh.next();
                Scanner sh2 = new Scanner(System.in);
                System.out.println("Enter user Password");
                String b = sh2.next();

                // verification of user & pass
                if (a.equals(aa3.pRead()) && (b.equals(aa3.pReadP()))) {
                    System.out.println("Welcome " + firstName);
                    break;
                } else {
                    isTru++;
                    System.out.println("\nWrong information, please try again.");
                    if ( isTru==3) {
                        System.out.println("You are back to main menu");
                        ShopMenu.runMenu();
                    }
                }

            }
        }catch (InputMismatchException e){
            System.out.println("Wrong input. GOODBYE");
            System.exit(0); //out from the program
        }
        // if any announcement post it here
        System.out.println("Please pickup the trash. By Mall management");

        // owner in store menu
        runMenu();  //call menu method
        Scanner b1 = new Scanner(System.in);
        int select = b1.nextInt();
        while (select<0 || select> 5){
            try {
                System.out.print("Enter choice: ");
                select = Integer.parseInt(b1.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Invalid entry, please try again.");
            }
        }
        System.out.println("to be continue ...");

    }
    public void runMenu(){
        while (!exit){
            shopMenuHere();
            int choice = getInputIN();
            shopMenuINStore(choice);
        }
    }
    // in store menu
    public void shopMenuHere(){

        System.out.println("1. Shop stocks");
        System.out.println("2. Check employs");
        System.out.println("3. Check Shop Balance");
        System.out.println("4. Notifications");
        System.out.println("5. Exit to main");
    }
    protected int getInputIN(){
        Scanner in = new Scanner(System.in);
        int choice = -1;
        while (choice<0 || choice> 5){
            try {
                System.out.print("Enter choice: ");
                choice = Integer.parseInt(in.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Invalid entry, please try again.");
            }
        }return choice;
    }
    protected void shopMenuINStore(int choice){
        switch (choice){
            case 5: exit=true;
                System.out.println("\n\t GoodBye");
                System.out.println(" ");
                ShopMenu.runMenu();
                break;
            case 1: // to
                System.out.println("\nStock currently in shop: ");
                bb3.strList();
                break;
            case 2: //to
                System.out.println("\nCheck employs");
                System.out.println("You have 3 employees ");
                break;
            case 3: // to
                System.out.println("\nCheck Shop Balance");
                System.out.println("- STOP - Private");
                break;
            case 4: //
                System.out.println("\nNotifications");

                break;
            default: //error
                System.out.println("Unexpected error ");
                break;
        }
    }

}
