package sampleWork;


import java.util.HashMap;
import java.util.Map;

public class map_findDoubles {
    public static void main(String[] args) {
        // Find double value and count

            String[] myList = {"AA","bB","CC","aA","bB","AA","Bb","CC","Aa","Ff"};
            //AA=4, BB=3, CC=2, FF=1

            findThis(myList);
    }
    public static void findThis(String[] arr){
        Map<String,Integer> wordFind = new HashMap<>();

        for (int i=0;i<arr.length;i++){
            String store = arr[i];
            int count = 0;
            for (int j=0;j<arr.length;j++){
                if(j<i && arr[j].equalsIgnoreCase(arr[i])){
                    break;
                }
                if(arr[j].equalsIgnoreCase(arr[i])){
                    count++;
                    store = arr[j].toLowerCase();
                }
                if(j==arr.length-1){
                    wordFind.put(store.toLowerCase(),count);
                }
            }
        }
        System.out.println("In double: "+wordFind);

    }
}
