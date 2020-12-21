package group_4_Project.shop_2;

import java.util.*;

public class shopStock2 {


    public static Map<Integer, List<String>> listOf2 = new HashMap<>();
    public static List<String>Swatch=new ArrayList<>();
    public static List<String>TimeA=new ArrayList<>();
    public static List<String>Nautical=new ArrayList<>();
    public static List<String>Bvlgari=new ArrayList<>();
    public static List<String>Swatch_Kids=new ArrayList<>();
    public static List<String>TommyH = new ArrayList<>();
    public static List<String>rolex = new ArrayList<>();


    public static int aSwatch = 120;
    public static int prTimeA= 160;
    public static int prNautical= 40;
    public static int prBvlgari= 150;
    public static int prSwatch_Kids= 80;
    public static int prTommyH= 20;
    public static int prrolex= 550;

    public void priceInfo(){
        System.out.println("price unit " + Swatch.get(0) + " is $" + aSwatch);
        System.out.println("price unit " + TimeA.get(0) + " is $" + prTimeA);
        System.out.println("price unit " + Nautical.get(0) + " is $" + prNautical);
        System.out.println("price unit " + Bvlgari.get(0) + " is $" + prBvlgari);
        System.out.println("price unit " + Swatch_Kids.get(0) + " is $" + prSwatch_Kids);
        System.out.println("price unit " + TommyH.get(0) + " is $" + prTommyH);
        System.out.println("price unit " + rolex.get(0) + " is $" + prrolex);
    }

    public void strList() {

        listOf2.put(200, Swatch);
        listOf2.put(201, TimeA);
        listOf2.put(202, Nautical);
        listOf2.put(203, Bvlgari);
        listOf2.put(204, Swatch_Kids);
        listOf2.remove(205, TommyH);
        listOf2.put(206,rolex);

        Swatch.add("Swatch");
        Swatch.add("Swatch");

        Nautical.add("Nautical");
        Nautical.add("Nautical");
        Nautical.add("Nautical");

        Bvlgari.add("Burglary");
        Bvlgari.add("Burglary");
        Bvlgari.add("Burglary");

        Swatch_Kids.add("Swatch_Kids");
        Swatch_Kids.add("Swatch_Kids");

        TommyH.add("TommyH");
        TommyH.add("TommyH");
        TommyH.add("TommyH");
        TommyH.add("TommyH");

        rolex.add("rolex");
        rolex.add("rolex");
        rolex.add("rolex");

        TimeA.add("TimeA");
        System.out.println(listOf2);

        Scanner inAdd1 = new Scanner(System.in);
        System.out.println("More action (M), or exit to menu (X)");
        char chi = inAdd1.next().charAt(0);

        if(chi=='M' || chi == 'm'){
            System.out.println("Do you want to add (A), or remove (R)");
            System.out.println("Do you want to see prices?(Y) or (N)");

            char ent = inAdd1.next().charAt(0);

            if (ent == 'A' || ent == 'a') {   // if 1
                System.out.println("");
                //Scanner inAdd1 = new Scanner(System.in);
                System.out.println("Enter number and name.");
                int num = inAdd1.nextInt();
                String val = inAdd1.next();
                listOf2.put(num, Collections.singletonList(val));
                //System.out.println(num+" "+val);

            } else if (ent == 'R' || ent == 'r') {
                // Scanner inAdd2 = new Scanner(System.in);
                System.out.println("You want remove ?");
                int num2 = inAdd1.nextInt();
                String val2 = inAdd1.next();
                listOf2.remove(num2,Collections.singletonList(val2));
                //System.out.println(num2+" "+val2);
            } else if (ent == 'y' || ent == 'Y') {
                    try {
                        System.out.println("price unit " + Swatch.get(0) + " is $" + aSwatch+" currently in stock "+Swatch.size());
                        System.out.println("price unit " + TimeA.get(0) + " is $" + prTimeA+" currently in stock "+TimeA.size());
                        System.out.println("price unit " + Nautical.get(0) + " is $" + prNautical+" currently in stock "+Nautical.size());
                        System.out.println("price unit " + Bvlgari.get(0) + " is $" + prBvlgari+" currently in stock "+Bvlgari.size());
                        System.out.println("price unit " + Swatch_Kids.get(0) + " is $" + prSwatch_Kids+" currently in stock "+Swatch_Kids.size());
                        System.out.println("price unit " + TommyH.get(0) + " is $" + prTommyH+" currently in stock "+TommyH.size());
                        System.out.println("price unit " + rolex.get(0) + " is $" + prrolex+" currently in stock "+rolex.size());
                    }catch (Exception e){
                        e.printStackTrace();
                    }
            }else {
                System.out.println("Error ");
            }

                    System.out.println("Do you want to continue? (Y).(N)");
                    char chi2 = inAdd1.next().charAt(0);
                    if(chi2=='Y' || chi2 == 'y') {
                        strList();
                    }else{
                       // System.out.println("Out in");
                        new shopOwner2().runMenu();
                    }
        }else{
            //System.out.println("Out out");
            new shopOwner2().runMenu();
        }
    }



}
