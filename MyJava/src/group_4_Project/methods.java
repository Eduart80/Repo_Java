package group_4_Project;

import java.util.InputMismatchException;
import java.util.Scanner;
/////////////////////  only practice ////////////////
// Update : test on scanner in request

public class methods {
    public static void main(String[] args) {
        runMenu();
    }

        protected static String firstName = "n";
        protected static String lastName = "n";
        public static String password = "0";
        protected static String shopName = "n";
        protected static int account = 100;
        protected static boolean shopOpen = false;

        //methods connection
        credential aa1 = new credential();

        //start in shop by owner
        public static void shopMain() {
            if(!shopOpen){  // If shop is true continue , if not return to Main
                return;
            }
            // enter user and password
            try{ Scanner sh = new Scanner(System.in);
                System.out.println("Enter user Name");
                String a = sh.next();
                Scanner sh2 = new Scanner(System.in);
                System.out.println("Enter user Password");
                String b = sh2.next();

                // verification of user & pass
                if (a.equals("j") || (b.equals("9"))){
                    System.out.println("Welcome " + firstName);
                }else  {
                    System.out.println("Wrong information, please try again.");
                    return;
                }
            }catch (InputMismatchException e){
                System.out.println("Wrong input. GOODBYE");
                System.exit(0); //out from the program
            }
            // owner in store menu
            shopMenu();  //call menu method
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
        // in store menu
        public static void shopMenu(){
            System.out.println("0. Check shop stock");
            System.out.println("1. Add a product");
            System.out.println("2. remove a product");
            System.out.println("3. Close the store");
            System.out.println("4. Exit to main");
        }
        // request from owner to Mall
        public static void askRequest(String first, String last,String pas, String shopN, boolean request){
            firstName= first;
            lastName = last;
            password = pas;
            shopName = shopN;
            shopOpen = request;
            account++;
        }
        // condition of approval
        public static boolean checkCondition(){
            if(shopOpen){
                System.out.println("Congratulation, Shop is open for trading.");
            }else {
                System.out.println("Verification needed");
            }return true;
        }
        // Info
        public static void information(){
            System.out.println("Shop owner information: ");
            System.out.println("Name: "+firstName+" "+lastName);
            System.out.println("Shop name: "+shopName);
            System.out.println("Status: "+ shopOpen);
            System.out.println("Account: "+account);
        }

        public static void toOpenShop() {
            //Request from e person to open shop

            System.out.println("A person ask to open a shop in your Mall.");
            System.out.println("Do you want to approve? (Y) for Yes, (N) for No");
            Scanner in = new Scanner(System.in);
            char Y = in.next().charAt(0);
            if (Y == 'y') {
                Scanner insi = new Scanner(System.in);
                System.out.println("Name: ");
                String firstN = insi.next();
                System.out.println("Last: ");
                String lastN = insi.next();
                System.out.println("Pass: ");
                String pas = insi.next();
                System.out.println("Shop Name: ");
                String shopName = insi.next();
                System.out.println("Request: ");
                boolean request = insi.nextBoolean();
                askRequest(firstN, lastN,pas, shopName, request);
                checkCondition();
                information();
            } else {
                System.out.println("\nMaybe next time. Sorry");
            }
        }
    static boolean exit;
    static shopOwner_1 a1 = new shopOwner_1();
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
                toOpenShop();
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


//    public void inLoops(boolean isTrue){
//        if(isTrue){
//            System.out.println("memo per ty ...");
//        }else if(isTrue){
//            System.out.println("Next line ");
//        }
//    }


