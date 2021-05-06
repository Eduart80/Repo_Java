package Intervieu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class removeDublicate {
    public static void main(String[] args) {


        Integer[] tom = {1, 1, 2, 5, 5, 8, 9, 9, 7, 7, 4, 5, 6, 3, 2, 1, 1, 2, 3, 6, 5, 4, 7, 8, 9, 6};
        // linkedHashSet
        LinkedHashSet<Integer> linkSet = new LinkedHashSet<Integer>(Arrays.asList(tom));
        ArrayList<Integer> numberOut = new ArrayList<>(linkSet);
        System.out.println(numberOut);

        //JDK 8 -> using  stream
        ArrayList<Integer> mario = new ArrayList<Integer>(Arrays.asList(tom));
        List<Integer> marioList = mario.stream().distinct().collect(Collectors.toList());
        System.out.println(marioList);


    }
}
