package group_4_Project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class credential {

        static File myWrite = new File("data.txt");
    // write Password
        public void writeToFile(String name,String pass) {
        try {
            FileWriter myWrite = new FileWriter("data.txt");
            myWrite.write(name);
            myWrite.write("\n"+pass);
            myWrite.close();
            //System.out.println("successfully added"+name+pass);
        } catch (IOException b) {
            System.out.println("Error in writing");
            b.printStackTrace();
             }
         }
    //Read info
    public String pRead() {
            String name ="";
        try {
            Scanner myRead = new Scanner(myWrite);
            while (myRead.hasNextLine()){
                String data1 = myRead.nextLine();
                name=data1;
            }myRead.close();
        }catch (IOException c){
            System.out.println("error in reading");
            c.printStackTrace();
        }
        return name;
    }
    //Read pass
    public String pReadP() {
        String pass = "";
        try {
            Scanner myRead = new Scanner(myWrite);
            while (myRead.hasNextLine()){
                String data1 = myRead.nextLine();
                String data2 = myRead.nextLine();
                pass=data2;
            }myRead.close();
        }catch (IOException c){
            System.out.println("error in reading");
            c.printStackTrace();
        }
        return pass;
    }

}
