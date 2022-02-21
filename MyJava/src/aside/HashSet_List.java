package aside;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

public class HashSet_List {
    public static void main(String[] args) {
        String[] lista = {"Naomi","Kambell","Laura","Seilor","Moon"};

        List<String> teksti = new ArrayList<>();
            teksti.add("Moli");
            teksti.add("Zhaba");
            teksti.add("Me Shoket");
            System.out.println(teksti.size());
            System.out.println(teksti);

        Set<String> tek = new HashSet<>();
            tek.add("Moli2");
            tek.add("Mondi");
            tek.add("Shoket");
            System.out.println(tek.size());
            System.out.println(tek);

        Hashtable<Integer, String> tavolina = new Hashtable<>();
            tavolina.put(1, "Mandi");
            tavolina.put(2, "Loni");
            tavolina.put(3, "Kaqoli");
            System.out.println(tavolina.size());
            System.out.println(tavolina);

        HashMap<Integer, String> map = new HashMap<>();
            map.put(1,"Vere");
            map.put(22, "Konjak");
            map.put(3, "Suko");
            System.out.println(map.size());
            System.out.println(map);
                System.out.println(map.containsKey(1));
                System.out.println(map.containsValue("Suko"));
                map.remove(3);
                System.out.println(map);
    }



}
