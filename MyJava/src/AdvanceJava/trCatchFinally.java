package AdvanceJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class trCatchFinally {
    public static void main(String[] args) {

        try {
            System.out.print("Hello world");
        }catch (Exception e) {
            System.out.println("e");
        }finally {
            System.out.println("!");
        }

        String[] array = new String[]{"A","B","C"};
        List<String> list1 = Arrays.asList(array);
        List<String> list2 = new ArrayList<>(Arrays.asList(array));
        List<String> list3 = new ArrayList<>(Arrays.asList("A", new String("B"), "C"));
        System.out.println(list1.equals(list2));
        System.out.println(list1.equals(list3));





    }
}
