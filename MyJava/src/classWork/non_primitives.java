package classWork;

import java.util.Arrays;

public class non_primitives {

    public static void main(String[] args) {

        //method trim()
        //it remove the space in front and in the end of the sentence
        String cityName = "   New York is big    ";
        cityName = cityName.trim();
        System.out.println(cityName);

        //method: subString() fetch a small portion af a string
        //two flavor -  begin index
        //              begin index to end index
        String citySubName = cityName.substring(4);
        System.out.println(":"+citySubName);

        String cityStEnd = cityName.substring(5,8);
        System.out.println(cityStEnd);

        //method: split()
        //this works only on strings, and split create Arrays
        cityName = cityName.toLowerCase();
        String[] afterSplit = cityName.split(" ");
        System.out.println(Arrays.toString(afterSplit));


    }


}

