package homeWork;

import java.security.Key;
import java.security.KeyStore;
import java.util.*;

public class homeWork_10 {
    /**
     * Question 2:
     * Create a hashMap with any numbers of key-value pairs from the user
     * Key should be Integer
     * Value should be String
     * <p>
     * Create method that will print the keys with same value, else "All keys have different values"
     * <p>
     * Input to method -> [{101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"}]
     * Output (print) ->
     * "happy" with keys -> 101, 103, 106
     * "peace" with keys -> 102, 105
     * <p>
     * Input to method -> [{111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"}]
     * Output (print) ->
     * All keys have different values
     *
     * read value - if double -  store keys
     */
    public static void main(String[] args) {

///////// find how many keys in a double values
        HashMap<Integer, String> coup = new HashMap<>();
        coup.put(101, "Venus");
        coup.put(150, "Tera");
        coup.put(200, "Mars");
        coup.put(51, "Jupiter");
        coup.put(631, "Moon");
        coup.put(151, "Tera");
        coup.put(100, "Sun");
        coup.put(120, "Tera");
        coup.put(635, "Moon");
        coup.put(731, "Moon");
        coup.put(111, "Venus");

        reaDD(coup);

////////// find how many doubles
        List<String> words = new Stack<>();
        words.add("happy");
        words.add("peace");
        words.add("joy");
        words.add("grow");
        words.add("joy");
        words.add("laugh");
        words.add("happy");
        words.add("joy");
        words.add("laugh");
        words.add("peace");

        findIn(words);

/////////////  from last class assignment
        Map<Integer,String> ssnData = new HashMap<>();
        ssnData.put(101, "Happy");
        ssnData.put(102, "Very Happy");
        ssnData.put(1000, "Peace");
        ssnData.put(9898, "stay healthy");
        reM(ssnData);
    }

    public static void findIn(List<String> name) {
        for (int i = 0; i < name.size(); i++) {
            int count = 0;
            for (int j = 0; j < name.size(); j++) {
                if (j < i && name.get(i) == name.get(j)) {
                    break;
                }
                if (name.get(i) == name.get(j)) {
                    count++;
                }
                if (j == name.size() - 1) {
                    System.out.println("Found " + name.get(i) + " is present " + count + " times.");
                }
            }
        }
    }
    //// method 2
//
     public static void reaDD(Map<Integer,String> arr){

        List<String>app=new ArrayList<>();

        for(int i=0; i<arr.size();i++){
            System.out.println(arr.get(i));

            for(int j=0; j<arr.size();j++){
                if(i<j && arr.get(i)== arr.get(j)){
                    break;
                }
                if(arr.get(i).equals(arr.get(j))){
                   app.add(arr.get(j));
                }
            }
            //System.out.println("last "+arr.get(i)+" ");
        }
         System.out.println(app);
     }
     // from last classWork
     public static void reM(Map<Integer,String> arr) {

         for (Map.Entry<Integer, String> entry1 : arr.entrySet()) {
             System.out.println(entry1.getValue() + " -> " + entry1.getKey());
         }
     }










}
