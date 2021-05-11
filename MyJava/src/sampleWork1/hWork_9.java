package sampleWork1;

import java.util.ArrayList;
import java.util.Scanner;

public class hWork_9 {

    public static void main(String[] args) {

        // method connection
        System.out.println("Open your restaurant: ");
        restaurant_Methods a1 = new restaurant_Methods("Bondy", 50);

        System.out.println("\tWELCOME");
        System.out.println("\t  to");
        System.out.println("Restaurant "+a1.restName);
        System.out.println("Available seats "+a1.guestCapacity+" guests");
        System.out.println("New costumers ...");

        Scanner in = new Scanner(System.in);
        System.out.println("How many people?");
        int enterIn = in.nextByte();
        // methods to calculate guest count + guest capacity
        a1.guestCap(enterIn);
        a1.geCount(enterIn);
        a1.info();

        System.out.println("Oh, people are leaving ..");
        Scanner in2 = new Scanner(System.in);
        int leave = in2.nextByte();
        a1.gLeave(leave);
        a1.summery();

/**
 * Create a method that is able to find/return the string occurring maximum number of times in given ArrayList.
 * ["happy", "peace", "joy", "grow, "peace", "happy", "peace", "grow"]
 */
        ArrayList<String>findW=new ArrayList<>();
        findW.add("happy");
        findW.add("peace");
        findW.add("joy");
        findW.add("grow");
        findW.add("peace");
        findW.add("happy");
        findW.add("peace");
        findW.add("grow");

        String[] name = {"happy", "peace", "joy", "grow", "peace", "happy", "peace", "grow"};
        findIn(name);
}// end of Main

    public static void findIn(String[] name){

        for (int i=0; i<name.length; i++){
            int count = 0;
            for(int j=0;j<name.length;j++) {
                if (j<i && name[i]==name[j]) {
                    break;
                }
                if(name[i]==name[j]){
                    count++;
                }
                if(j==name.length-1){
                    System.out.println("Found "+name[i]+" is present "+count+" times.");
                }
            }
        }
    }
    /**
     * get the first value and check for double = for loop
     * second for loop to find mach
     * if found, store in count
     *
     */



}