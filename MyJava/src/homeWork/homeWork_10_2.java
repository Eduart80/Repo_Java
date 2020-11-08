package homeWork;

import java.util.*;

public class homeWork_10_2 {
    public static void main(String[] args) {
        HashMap<Integer, String> coup = new HashMap<>();
        coup.put(101, "Venus");    // 2
        coup.put(150, "Tera");     // 3
        coup.put(200, "Mars");      //1
        coup.put(51, "Jupiter");   // 1
        coup.put(631, "Moon");     // 2
        coup.put(151, "Tera");     // 3
        coup.put(100, "Sun");      // 1
        coup.put(1090, "Sun");     // 1
        coup.put(120, "Tera");     // 3
        coup.put(635, "Moon");      //2
        coup.put(731, "Moon");      //3
        coup.put(111, "Venus");     //2

        setOfDouble(coup);
    }
    public static void setOfDouble(Map<Integer,String> dataMap) {
        Set<Integer> allKeys = dataMap.keySet();
        Map<String,Set<Integer>> keyWithSameVal = new HashMap<>();

        for(Integer ii: allKeys){
            Set<Integer> keyWithDoubleVal = new HashSet<>(); // to is to store all keys with double val
            String keyVal = dataMap.get(ii);

            for(Integer jj : allKeys){

                if(!jj.equals(ii)){

                    if(dataMap.get(jj).equalsIgnoreCase(keyVal)){
                        keyWithDoubleVal.add(ii);
                        keyWithDoubleVal.add(jj);
                    }
                }
            }
            if(keyWithDoubleVal.size()>0){
                keyWithSameVal.put(keyVal.toLowerCase(),keyWithDoubleVal);
            }
        }
        if(keyWithSameVal.size()>0){
            for(String jj : keyWithSameVal.keySet()){
                System.out.println(jj + " keys -> "+keyWithSameVal.get(jj));
            }
        }else {
            System.out.println("All keys have different values.");
        }
    }

}
