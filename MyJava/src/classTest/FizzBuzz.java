package classTest;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {

        List<Object>myArr = new ArrayList<>();
        int count = 1;

        for(int i=0; i <= 21 ; i++) {
            if(count % 3 == 0 && count % 5 == 0){
                myArr.add("FizzBuzz");
            }
            else if(count % 3 == 0){
                myArr.add("Fizz");
            }
            else if(count % 5 == 0){
                myArr.add("Buzz");
            }
            else {
                myArr.add(count);
            }
            count++;
           // System.out.println(myArr);
        }
        System.out.println(myArr);
    }
}
