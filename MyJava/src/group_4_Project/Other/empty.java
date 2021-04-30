package group_4_Project;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class empty {
    public static void main(String[] args) {
         write();
        System.out.println("Name pui "+ poiu());
        System.out.println("Name is "+ pReadw());
        System.out.println("Pass is "+ pRead1());
        System.out.println("Pass is "+ pReadP2());
    }///Main
    public static void write(){
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String pass = in.next();
        try {
            FileWriter myWrite1 = new FileWriter("fileN.txt");
            myWrite1.write(name);
            myWrite1.write("\n"+pass);
            myWrite1.close();
            // System.out.println("Successfully added");
        } catch (IOException b) {
            System.out.println("Error in writing");
            b.printStackTrace();
        }
    }
    public static String poiu(){
        String data="";
        try {
            File myObj = new File("fileN.txt");
            Scanner myRead = new Scanner(myObj);
            while (myRead.hasNextLine()){
                String data1 = myRead.next();
                String data2 = myRead.next();
                data =data1;

            }
            myRead.close();
        }catch (FileNotFoundException e){
            System.out.println("Error");
            e.printStackTrace();
        }
        return data;
    }
    public static String pReadw() {
        String name ="";
        try {
            File myWrite1 = new File("fileN.txt");
            Scanner myRead = new Scanner(myWrite1);
            while (myRead.hasNextLine()){
                String data1 = myRead.next();
                name=data1;
            }myRead.close();
        }catch (IOException c){
            System.out.println("error in reading");
            c.printStackTrace();
        }
        return name;
    }
    //read name
    public static String pRead1() {
        String name ="";
        try {
            File myWrite1 = new File("fileN.txt");
            Scanner myRead = new Scanner(myWrite1);
            while (myRead.hasNextLine()){
                String data1 = myRead.next();
                String data2 = myRead.next();
                name=data1;
            }myRead.close();
        }catch (IOException c){
            System.out.println("error in reading");
            c.printStackTrace();
        }
        return name;
    }
    //Read pass
    public static String pReadP2() {
        String pass = "";
        try {
            File myWrite1 = new File("fileN.txt");
            Scanner myRead = new Scanner(myWrite1);
            while (myRead.hasNextLine()){
                //String data1 = myRead.nextLine();
                pass= myRead.nextLine();
            }myRead.close();
        }catch (IOException c){
            System.out.println("error in reading");
            c.printStackTrace();
        }
        return pass;
    }
}