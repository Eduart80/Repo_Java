package labs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class textFileCreate {
    public static void main(String[] args) throws IOException {
//Object will be used to create file and read in file
//Path in Windows has (" \\ "), path in Mac and Linux has (" / ")
// if u use just "testfile.txt", u will see a file in bottom of your project
//PS. the last action is delete file, make sure not to be active

        File newObj = new File("testfile.txt");

//  to create a file
       try {
           if (newObj.createNewFile()) {
               System.out.println("File created");
           }else {
               System.out.println("File not created");
           }
       }catch (IOException e){
           System.out.println("error in creation ");
           e.printStackTrace();
       }

/// to write in the file

       try {
           FileWriter myWrite = new FileWriter("testfile.txt");
           myWrite.write("Jon Bravo");
           myWrite.close();
           System.out.println("successfully wrote");
       }catch (IOException b){
           System.out.println("Error in writing");
           b.printStackTrace();
       }

/// to read the file

        try {
            Scanner myRead = new Scanner(newObj);
            while (myRead.hasNextLine()){
                String data = myRead.nextLine();
                System.out.println(data);
            }myRead.close();
        }catch (IOException c){
            System.out.println("error in reading");
            c.printStackTrace();
        }

// delete this text file

        if(newObj.delete()){
            System.out.println("file successfully deleted");
        }else {
            System.out.println("Failed, file still present");
        }
    }
}
