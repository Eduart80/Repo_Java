package homeWork;

import java.util.*;

public class homeWork_10 {

    public static void main(String[] args) {


////////// find how many doubles
        List<String> words = new Stack<>();
        words.add("happy");//2
        words.add("peace");
        words.add("Joy");//3
        words.add("grow");
        words.add("joy");
        words.add("laugh");//2
        words.add("happy");
        words.add("jOy");
        words.add("laugh");

        findIn(words);

/////////////  from last class assignment
        Map<Integer,String> ssnData = new HashMap<>();
        ssnData.put(101, "Happy");
        ssnData.put(102, "Very Happy");
        ssnData.put(1000, "Peace");
        ssnData.put(9898, "stay healthy");
        reM(ssnData);

    }// End of Main

    ///////// find how many doubles method
    public static void findIn(List<String> name) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (int i=0;i< name.size();i++) {
            String wordsA = name.get(i);
            int count =1;
            for(int j=i+1;j<name.size();j++)
                if (name.get(j).equalsIgnoreCase(wordsA)) {
                    count++;
                }
                if (count > 1 && !wordCount.containsKey(wordsA.toLowerCase())) {
                    wordCount.put(wordsA.toLowerCase() ,count);
                }
        }
        System.out.println("Found " + wordCount);
    }

    //// method 2
     // from last classWork
     public static void reM(Map<Integer,String> arr) {

         for (Map.Entry<Integer, String> entry1 : arr.entrySet()) {
             System.out.println(entry1.getValue() + " -> " + entry1.getKey());
         }
     }










}
