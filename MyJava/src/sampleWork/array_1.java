package sampleWork;

import java.util.Arrays;

public class array_1 {

    public static void main(String[] args) {

        /*
        Array ([])
        is a non-primitive type which can store multiple value in the same datatype

        syntax of an array
        datatype[] varName = new datatype[totalValueCount];
        OR
        datatype[] arrName = {value1, value2, value3, value4, value5};
         */

        String[] myBill = new String[3];
        myBill[0] = "Tom High Finger ";
        myBill[1] = "Mamushka Billi Ge";
        myBill[2] = "Johny Bravo";

        System.out.println(Arrays.toString(myBill));

        //1. split the String[] by spaces
        //2. length of String[0] -> length = 29 for example
        //3. String lastWord = arrName[length-1]
        //4. lastWord.length()

        /*
        int lastSpaceIndex = statement.lastIndexOf(" ");
        String lastWord = statement.subString(lastSpaceIndex+1);
        int lastWorLength = lastWord.length();
        sout .....
         */

        String statement = "Hi my name is Tom the brave";
        String[] afterSplit = statement.split(" ");      //split array
        System.out.println(Arrays.toString(afterSplit));

        int findH = statement.indexOf("h");       //start count from space
        System.out.println(findH);
        String findName = statement.substring(0); //start from the index given //if given (0,5) it will show only between this indexes
        System.out.println(findName);

        int lastWord = findName.length();
        System.out.println("All together "+lastWord+" letters");

        // an Array of int datatype
        int[] folderName = new int[5];
        folderName[0] = 100;
        folderName[1] = 20;
        folderName[2] = 50;
        folderName[3] = 30;
        folderName[4] = 22;
        System.out.println(Arrays.toString(folderName));


    }
}
