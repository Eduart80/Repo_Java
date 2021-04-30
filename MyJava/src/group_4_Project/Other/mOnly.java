package group_4_Project;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mOnly {
    public static void main(String[] args) {

        menu d = new menu();

        String name = "Swotch";
        List<String> thSwatch = Arrays.asList("metal", "Lather Blue", "Automatic","gold");
        System.out.println(name+" "+ thSwatch);


        Map<Integer,String> listOf = new HashMap<>();
        listOf.put(100,"Swatch");
        listOf.put(101,"Time-A");
        listOf.put(102,"Nautical");
        listOf.put(103,"Burglary");
        listOf.put(104,"Swatch-Kids");
        listOf.remove(100);
         listOf.replace(101,"Hallall-Food");
        System.out.println(listOf);
    }
    public void redoAdd(){
        Map<Integer,String> listOf = new HashMap<>();
        listOf.put(100,"Swatch");
        listOf.put(101,"Time-A");
        listOf.put(102,"Nautical");
        listOf.put(103,"Burglary");
        listOf.put(104,"Swatch-Kids");
        listOf.remove(100);
        listOf.replace(101,"Hallall-Food");
        System.out.println(listOf);

    }
}
