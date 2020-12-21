package group_4_Project.shop_NewEntry;

import group_4_Project.menu;

import java.util.Scanner;

public class removeMagazine extends menu {
    //menu aa = new menu();


    public void aList(){
            System.out.println("add something");
            Scanner in = new Scanner(System.in);
            String toAdd = in.next();
            kit_kat.add(toAdd);
        System.out.println(kit_kat);

    }
    public void aListR(){
        System.out.println("add something");
        Scanner in = new Scanner(System.in);
        String toAdd = in.next();
        kit_kat.remove(toAdd);
        System.out.println(kit_kat);

    }

}
