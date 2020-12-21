package classWork;

import java.util.*;

public class hset {
    public static void main(String[] args) {
        // 1
        List<Integer> ss=new ArrayList<>();
        ss.add(30);
        ss.add(21);
        ss.add(31);
        ss.add(25);
        ss.add(22);

        boo(ss);
        /// 2
        Map<Integer,String> ssnData = new HashMap<>();
        ssnData.put(101, "Happy");
        ssnData.put(102, "Very Happy");
        ssnData.put(1000, "Peace");
        ssnData.put(9898, "stay healthy");
        vol(ssnData);
    }
    public static void boo(List<Integer> arr){
        HashSet<Integer>List2=new HashSet<>(arr);
        if(List2.size()==arr.size()){
            System.out.println("Is false");
        }else {
            System.out.println("Is true ");
        }

    }
    ////// print key -> value
    public static void vol(Map<Integer,String> arr) {

        for (Map.Entry<Integer, String> entry1 : arr.entrySet()) {
            System.out.println(entry1.getValue() + " -> " + entry1.getKey());
        }
    }
}
