package group_4_Project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class shopOwner_1 {

    protected String firstName = "null";
    protected String lastName = "null";
    public String password = "0";
    protected String shopName = "null";
    protected int account = 100;
    protected boolean shopOpen = false;

    //methods connection
    credential aa1 = new credential();

    //start in shop by owner
        public void shopMain() {
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
            if (a.equals(aa1.pRead()) || (b.equals(aa1.pReadP()))){
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
        public void shopMenu(){
            System.out.println("0. Check shop stock");
            System.out.println("1. Add a product");
            System.out.println("2. remove a product");
            System.out.println("3. Close the store");
            System.out.println("4. Exit to main");
        }
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
                System.out.println("Congratulation, Shop is open for trading.");
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
                askRequest("Loni", "Bravo","1111", "Seiko", true);
                aa1.writeToFile(firstName,password);
                checkCondition();
                information();
            } else {
                System.out.println("\nMaybe next time. Sorry");
            }
        }

}
