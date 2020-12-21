package group_4_Project.shop_NewEntry;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class shopStock1 {
    public static Map<Integer, String> listOf1 = new HashMap<>();
    public void strList() {


        System.out.println("List "+listOf1);

        Scanner inAdd1 = new Scanner(System.in);
        System.out.println("More action (M), or exit to menu (X)");
        char chi = inAdd1.next().charAt(0);

        if(chi=='M' || chi == 'm'){
            System.out.println("Do you want to add (A), or remove (R)");

            char ent = inAdd1.next().charAt(0);

            if (ent == 'A' || ent == 'a') {   // if 1
                System.out.println("");
                //Scanner inAdd1 = new Scanner(System.in);
                System.out.println("Enter key number and product name.");
                int num = inAdd1.nextInt();
                String val = inAdd1.next();
                listOf1.put(num,val);
                //System.out.println(num+" "+val);

            } else if (ent == 'R' || ent == 'r') {
                // Scanner inAdd2 = new Scanner(System.in);
                System.out.println("Enter key number and product name to remove");
                int num2 = inAdd1.nextInt();
                String val2 = inAdd1.next();
                listOf1.remove(num2,val2);
                //System.out.println(num2+" "+val2);
            } else {
                System.out.println("Error ");
            }
            System.out.println(listOf1);
            System.out.println("Do you want to continue? (Y).(N)");
            char chi2 = inAdd1.next().charAt(0);
            if(chi2=='Y' || chi2 == 'y') {
                strList();
            }else{
                //System.out.println("Out in");
                new shopOwner_1().runMenu();
            }
        }else{
            //System.out.println("Out out");
            new shopOwner_1().runMenu();
        }
    }

}
