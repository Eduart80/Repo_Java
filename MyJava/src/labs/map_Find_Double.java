package labs;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {
       String[] words = {"happy", "peace", "joy", "happy","grow", "joy", "laugh", "HaPpy","joy", "laugh", "joy"};
        //String[] words = {"jon", "peace","joy", "joy", "happy"};
        List<String> wordsList = Arrays.asList(words);

        String word = "joy";
        Map<String, Integer>wordCount = new HashMap<>();
        int count =0;
        for (int i=0;i< wordsList.size();i++){

                if(wordsList.get(i).equalsIgnoreCase(word)){
                    count++;
                }
        }
        if(count>0){
            wordCount.put(word,count);
        }
        System.out.println(wordCount);

        System.out.println(findDouble(wordsList));

    }// End of Main


    public static Map<String, Integer> findDouble(List<String> arr){

        Map<String, Integer> wordCount = new HashMap<>();

        for (int i=0;i< arr.size();i++) {
            String wordsA = arr.get(i);
            int count =1;
            for(int j=i+1;j<arr.size();j++)
                if (arr.get(j).equalsIgnoreCase(wordsA)) {
                    count++;
                }
            if (count > 1 && !wordCount.containsKey(wordsA.toLowerCase())) {
                wordCount.put(wordsA.toLowerCase() ,count);
            }
        }
        return wordCount;
    }
}
