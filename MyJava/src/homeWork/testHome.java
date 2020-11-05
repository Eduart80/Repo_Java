package homeWork;

import java.util.*;

public class testHome {
    public static void main(String[] args) {
        HashMap<Integer, String> coup = new HashMap<>();
        coup.put(101, "Venus");    // 2
        coup.put(150, "Tera");     // 3
        coup.put(200, "Mars");      //1
        coup.put(51, "Jupiter");   // 1
        coup.put(631, "Moon");     // 2
        coup.put(151, "Tera");     // 3
        coup.put(100, "Sun");      // 1
        coup.put(100, "Sun");      // 1
        coup.put(120, "Tera");     // 3
        coup.put(635, "Moon");      //2
        coup.put(731, "Moon");      //3
        coup.put(111, "Venus");     //2

        reaDD(coup);
        reaDD22(coup);
        /**
         * for loop 1 read first value
         *     for loop 2 scan all
         *     if found store key
         *
         */

    }
    public static void reaDD(Map<Integer,String> arr) {

        List<String > app = new ArrayList<>();


        for(String entry1 : arr.values()) {
            String name = arr.get(entry1);
            for (String entry2 : arr.values()) {

                if (entry1.equals(entry2)) {
                    System.out.println("name "+name+" "+arr.get(entry2));
                    break;
                }
            }

        }
    }

    public static void reaDD22(Map<Integer, String> arr) {

        Map<Integer, String> app = new HashMap<>();

        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size() - 1; j++) {
                if ( i != j) {

                    //System.out.println("print "+i+j);
                }
            }
            //System.out.println("last "+arr.get(i)+" "+app);
        }

    }

}

// List<String> myList = new ArrayList<>();
//    for (Map.Entry<String, String> entry : map.entrySet()) {
//        for (Map.Entry<String, String> entry2 : map.entrySet()){
//            if (entry.getValue().equals(entry2.getValue()))
//            {
//                myList.add(entry.getKey());
////            }
// (2)
//        for(int i=0; i<arr.size()-1;i++){
//
//            for(int j=0; j<arr.size()-1;j++){
//                if(i<j && arr.get(i)== arr.get(j)){
//                    break;
//                }
//                if(i==j){
//                    System.out.println("say hello"+arr.values());
//                }
//            }
//            System.out.println("last "+arr.get(i)+" "+app);
//        }

