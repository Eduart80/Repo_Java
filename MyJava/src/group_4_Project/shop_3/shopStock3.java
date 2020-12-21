package group_4_Project.shop_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class shopStock3 {


    public static Map<Integer, String> listOf3 = new HashMap<>();


    public void strList() {


        listOf3.put(300, "Boots");
        listOf3.put(301, "Sneakers");
        listOf3.put(302, "shoes");
        listOf3.put(303, "Sandal");
        listOf3.put(304, "Women's");
        listOf3.remove(305, "Kids");
        listOf3.replace(306, "Socks");

        System.out.println("List "+listOf3);

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
                listOf3.put(num,val);
                //System.out.println(num+" "+val);

            } else if (ent == 'R' || ent == 'r') {
                // Scanner inAdd2 = new Scanner(System.in);
                System.out.println("You want remove ?");
                int num2 = inAdd1.nextInt();
                String val2 = inAdd1.next();
                listOf3.remove(num2,val2);
                //System.out.println(num2+" "+val2);
            } else {
                System.out.println("Error ");
            }
                    System.out.println(listOf3);
                    System.out.println("Do you want to continue? (Y).(N)");
                    char chi2 = inAdd1.next().charAt(0);
                    if(chi2=='Y' || chi2 == 'y') {
                        strList();
                    }else{
                       // System.out.println("Out in");
                        new shopOwner3().runMenu();
                    }
        }else{
            //System.out.println("Out out");
            new shopOwner3().runMenu();
        }
    }

}
