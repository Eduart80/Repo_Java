package group_4_Project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class shopOwner_1 {

    String firstName = "null";
    String lastName = "null";
    String shopName = "null";
    int account = 100;
    boolean shopOpen = false;


        public void shopMain() {
            // enter user and password
        try{ Scanner sh = new Scanner(System.in);
            System.out.println("Enter user Name");
            String a = sh.next();
            Scanner sh2 = new Scanner(System.in);
            System.out.println("Enter user Password");
            byte b = sh2.nextByte();

                if (a.equals("jon") || b == 123) {          /// verification of user & pass
                    System.out.println("Welcome in if statement "+ firstName);
                }
            }catch (InputMismatchException e){
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
        public void shopMenu(){
            System.out.println("0. Check shop stock");
            System.out.println("1. Add a product");
            System.out.println("2. remove a product");
            System.out.println("3. Close the store");
            System.out.println("4. Exit to main");
        }
        // request from owner to Mall
        public void askRequest(String firstName, String lastName, String shopName, boolean request){
            this.firstName = firstName;
            this.lastName = lastName;
            this.shopName = shopName;
            shopOpen = request;
            account++;
        }
        // condition of approval
        public boolean checkCondition(){
            if(shopOpen){
                System.out.println("Congratulation, Shop is open for trading.");
            }else {
                System.out.println("'Stop' verification needed");
            }return true;
        }
        // Info
        public void information(){
            System.out.println("Shop owner information: ");
            System.out.println(firstName+" "+lastName);
            System.out.println("Shop name "+shopName);
            System.out.println("Status "+ shopOpen);
            System.out.println("Account "+account);
        }
}
