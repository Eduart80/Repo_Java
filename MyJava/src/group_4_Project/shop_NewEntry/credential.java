package group_4_Project.shop_NewEntry;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class credential {

     // write Password
        public void writeToFile(String name,String pass) {
        try {
            FileWriter myWrite1 = new FileWriter("fileN.txt");
            myWrite1.write(name);
            myWrite1.write("\n"+pass);
            myWrite1.close();
        } catch (IOException b) {
            System.out.println("Error in writing");
            b.printStackTrace();
             }
         }
    //Read Name
    public String pRead1() {
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
    public String pRead2() {
        String pass = "";
        try {
            File myWrite1 = new File("fileN.txt");
            Scanner myRead = new Scanner(myWrite1);
            while (myRead.hasNextLine()){
                pass= myRead.nextLine();
            }myRead.close();
        }catch (IOException c){
            System.out.println("error in reading");
            c.printStackTrace();
        }
        return pass;
    }

}
