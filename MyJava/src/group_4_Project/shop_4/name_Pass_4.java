package group_4_Project.shop_4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class name_Pass_4 {

    File myWrite = new File("C:\\Users\\zeedy\\Documents\\git\\Repo_Java\\MyJava\\src\\group_4_Project\\shop_4\\datashop4.txt");

    //Read Name
    public String pRead() {
        String name ="";
        try {
            Scanner myRead = new Scanner(myWrite);
            while (myRead.hasNextLine()){
                String data1 = myRead.nextLine();
                String data2 = myRead.nextLine();
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
