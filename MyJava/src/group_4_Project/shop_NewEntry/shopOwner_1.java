package group_4_Project.shop_NewEntry;

import group_4_Project.ShopMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class shopOwner_1 {

    protected String firstName = "null";
    protected String lastName = "null";
    public String password = "0";
    protected String shopName = "null";
    protected int account = 1001;
    protected boolean shopOpen = false;

    //methods connection
    credential aa1 = new credential();
    shopStock1 aa2 = new shopStock1();


    private static boolean exit;

    //start in shop by owner
        public void shopMain() {
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
                    if (a.equals(aa1.pRead1()) && (b.equals(aa1.pRead2()))) {
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
            runMenu();
        }
        // if any announcement post it here

        // in store menu
        public void runMenu(){
            while (!exit){
                shopMenu();
                int choice = getInputIN();
                shopMenuINStore(choice);
            }
        }
        public void shopMenu(){
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
                aa2.strList();
                break;
            case 2: //to
                System.out.println("\nCheck employs");
                System.out.println("No work force at this time");
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

    /////to reques to open new store

        // request from owner to Mall
        public void askRequest(String firstName, String lastName,String password, String shopName, boolean request){
            this.firstName = firstName;
            this.lastName = lastName;
            this.password = password;
            this.shopName = shopName;
            shopOpen = request;
            account++;
        }

        // condition of approval
        public boolean checkCondition(){
            if(shopOpen){
                System.out.println("Congratulation, Store is open for trading.");
            }else {
                System.out.println("Verification needed");
            }return true;
        }
        // Info
        public void information(){
            System.out.println("Shop owner information: ");
            System.out.println("Name: "+firstName+" "+lastName);
            System.out.println("Shop name: "+shopName);
            System.out.println("Status: "+ shopOpen);
            System.out.println("Account: "+account);
        }

        public void toOpenShop() {
            //Request from e person to open shop

            System.out.println("A person ask to open a shop in your Mall.");
            System.out.println("Do you want to approve? (Y) for Yes, (N) for No");
            Scanner in = new Scanner(System.in);
            char Y = in.next().charAt(0);
            if (Y == 'y') {
                //enter credentials required
                //shopOwner_1 a1 = new shopOwner_1();
                askRequest("Tom", "Bravo","11", "Seiko", true);
                aa1.writeToFile(firstName,password);
                checkCondition();
                information();
            } else {
                System.out.println("\nMaybe next time. Sorry");
            }
        }

}
