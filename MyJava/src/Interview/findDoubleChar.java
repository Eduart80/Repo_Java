package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class findDoubleChar {

    public static void main(String[] args) {
    printDoublicate("java is awesome");
    }
    public static void printDoublicate(String str){
        if (str == null){
            System.out.println("Null String");
            return;
        }
        if (str.isEmpty()){
            System.out.println("Empty String");
            return;
        }
        if (str.length()==1){
            System.out.println("String has only one character");
            return;
        }


        char world[] = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();

        for (Character cd : world){
            if (charMap.containsKey(cd)){
                charMap.put(cd , charMap.get(cd)+1);
            }else {
                charMap.put(cd, 1);
            }
        }

        //print map
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        int addme = 0;
        for (Map.Entry<Character, Integer> entry : entrySet){
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
                addme++;
            }
        }
        if(addme <= 0) {
            System.out.println("No double characters found");
        }

    }




}
