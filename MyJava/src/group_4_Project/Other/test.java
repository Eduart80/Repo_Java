package group_4_Project.Other;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

    File file = new File("testID.txt");
        System.out.println(file.exists());
                Scanner sh = new Scanner(System.in);
                System.out.println("Enter user Name");
                writeToFile(sh.next());
                    System.out.println("Enter Password");
                    writeToFile(sh.nextLine());
                try{
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        System.out.println("from file read "+ fRead());
        System.out.println("from second "+fRead2());
    }
    // write Password
    public static void writeToFile(String name) {
        try {
            FileWriter myWrite1 = new FileWriter("testID.txt");
            myWrite1.write(name);
           // myWrite1.write(name2);

            myWrite1.close();
        } catch (IOException b) {
            System.out.println("Error in writing");
            b.printStackTrace();
        }
    }
    //Read Name
    public static String fRead() {
        String name ="";
        try {
            File myWrite1 = new File("testID.txt");
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
    //Read pass
    public static String fRead2() {
        String pass = "";
        try {
            File myWrite1 = new File("testID.txt");
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
