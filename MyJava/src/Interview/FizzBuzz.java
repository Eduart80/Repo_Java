package Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzz {
//  Java 7
    public static void main(String[] args) {
// fizzbuzz on every 5 or 3
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

        // fizzbuzz on every 5 or 7
        fizzBazzAfter(20);
    }
    //NEW Java 8
    private static void fizzBazzAfter(int nmb){
        IntStream.rangeClosed(1, nmb)
                .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }


}
