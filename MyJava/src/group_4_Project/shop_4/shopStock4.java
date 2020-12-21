package group_4_Project.shop_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class shopStock4 {


    public static Map<Integer, String> listOf4 = new HashMap<>();
    public void strList() {

        listOf4.put(400, "Samsung");
        listOf4.put(401, "iPhone");
        listOf4.put(402, "Sony");
        listOf4.put(403, "Philips");
        listOf4.put(404, "Motorola");
        listOf4.remove(405, "ZTE");
        listOf4.replace(406, "Nokia");

        System.out.println("List "+listOf4);

        Scanner inAdd1 = new Scanner(System.in);
        System.out.println("More action (M), or exit to menu (X)");
        char chi = inAdd1.next().charAt(0);

        if(chi=='M' || chi == 'm'){
            System.out.println("Do you want to add (A), or remove (R)");

            char ent = inAdd1.next().charAt(0);

            if (ent == 'A' || ent == 'a') {   // if 1
                System.out.println("");
                //Scanner inAdd1 = new Scanner(System.in);
                System.out.println("Enter number and name.");
                int num = inAdd1.nextInt();
                String val = inAdd1.next();
                listOf4.put(num,val);
                //System.out.println(num+" "+val);

            } else if (ent == 'R' || ent == 'r') {
                // Scanner inAdd2 = new Scanner(System.in);
                System.out.println("You want remove ?");
                int num2 = inAdd1.nextInt();
                String val2 = inAdd1.next();
                listOf4.remove(num2,val2);
                //System.out.println(num2+" "+val2);
            } else {
                System.out.println("Error ");
            }
                    System.out.println(listOf4);
                    System.out.println("Do you want to continue? (Y).(N)");
                    char chi2 = inAdd1.next().charAt(0);
                    if(chi2=='Y' || chi2 == 'y') {
                        strList();
                    }else{
                        //System.out.println("Out in");
                        new shopOwner4().runMenu();
                    }
        }else{
           // System.out.println("Out out");
            new shopOwner4().runMenu();
        }
    }

}
