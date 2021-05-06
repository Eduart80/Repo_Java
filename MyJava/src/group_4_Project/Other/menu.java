package group_4_Project.Other;

import group_4_Project.shop_NewEntry.removeMagazine;

import java.util.*;

public class menu {

    /////////////////////  only practice ////////////////

    public static void main(String[] args) {
       strList();

    }
    public static Map<Integer, List<String>> listOf5 = new HashMap<>();
    public static List<String>kit_kat=new ArrayList<>();
    public static List<String>Gummy_Bear=new ArrayList<>();
    public static List<String>Twix=new ArrayList<>();
    public static List<String>Milky_Way=new ArrayList<>();
    public static List<String>M_and_M=new ArrayList<>();
    public static List<String> items = new ArrayList<>();
    public static List<String> shoes = new ArrayList<>();
    public static List<String>Snickers=new ArrayList<>();

    public static int prKitKat= 12;
    public static int prGumm= 16;
    public static int prTwix= 4;
    public static int prSnik= 6;
    public static int prMilky= 15;
    public static int prMM= 8;
    public static int prItem= 2;
    public static int prshoes= 55;

    public static removeMagazine h = new removeMagazine() ;

        public static void strList () {


            listOf5.put(100, kit_kat);
            listOf5.put(101, Gummy_Bear);
            listOf5.put(102, Twix);
            listOf5.put(104, Milky_Way);
            listOf5.put(105, M_and_M);
            listOf5.put(106, items);
            listOf5.put(103, shoes);
            listOf5.put(107, Snickers);


            items.add("shoes");
            items.add("snickers");

            shoes.add("Lather shoes");
            shoes.add("Lather shoes");
            shoes.add("Lather shoes");

            Snickers.add("Lather shoes");
            Snickers.add("Lather shoes");
            Snickers.add("Lather shoes");

            kit_kat.add("kit_kat");
            kit_kat.add("kit_kat");
            kit_kat.add("kit_kat");
            kit_kat.add("kit_kat");

            M_and_M.add("M_and_M");
            M_and_M.add("M_and_M");
            M_and_M.add("M_and_M");
            M_and_M.add("M_and_M");

            Gummy_Bear.add("Gummy_Bear");
            Gummy_Bear.add("Gummy_Bear");
            Gummy_Bear.add("Gummy_Bear");
            Gummy_Bear.add("Gummy_Bear");

            Milky_Way.add("Milky_Way");
            Milky_Way.add("Milky_Way");

            Twix.add("Twix");
            Twix.add("Twix");
            Twix.add("Twix");

            System.out.println("List " + listOf5);


            info();
        }
        public static void info(){
            System.out.println("price unit " + kit_kat.get(0) + " is $" + prKitKat);
            System.out.println("price unit " + Gummy_Bear.get(0) + " is $" + prGumm);
            System.out.println("price unit " + Twix.get(0) + " is $" + prTwix);
            System.out.println("price unit " + Snickers.get(0) + " is $" + prSnik);
            System.out.println("price unit " + Milky_Way.get(0) + " is $" + prMilky);
            System.out.println("price unit " + M_and_M.get(0) + " is $" + prMM);
            System.out.println("price unit " + items.get(0) + " is $" + prItem);
            System.out.println("price unit " + shoes.get(0) + " is $" + prshoes);

        }
}