package Interview;

import java.util.*;

public class arrayMerge {

    public static void main(String[] args) {
        String[] names1 = new String[] {"Eva", "Emma","zed", "Eva", "Olivia"};
        String[] names2 = new String[] {"God","Olivia", "Sophia","Eva", "Emma", "God"};
        System.out.println(uniqueNames(names1,names2) );
        int[] A = {1,7,2};
        int[] B = {3,4,5,9};
        merge(A, B);
        System.out.println(" ");
        System.out.println(Arrays.toString(merge2(A,B)));
    }
    // string arrays
    public static Set<String> uniqueNames(String[] names1, String[] names2) {
        Set<String> unicName = new HashSet<>();
        unicName.addAll(Arrays.asList(names1));
        unicName.addAll(Arrays.asList(names2));
        return unicName;
    }

    // merge two int arrays
    // void type
    public static void merge(int[] a, int[] b){
        for(int i=0;i<a.length;i++){
                System.out.print(a[i]+", ");
        }
        int doli = 0;
        for(int i=0;i<b.length;i++){
            if(doli < b.length-1){
                doli++;
                System.out.print(b[i]+", ");
            }else {
                System.out.print(b[i]);
            }
        }
    }
    //return type int
    public static int[] merge2(int[] a, int[] b){
        ArrayList<Integer> groupAll = new ArrayList<>();
        for (int k : a) {
            groupAll.add(k);
        }
        for (int j : b) {
            groupAll.add(j);
        }
       int[] ret = new int[groupAll.size()];
        Iterator<Integer> iter = groupAll.iterator();
        for(int i=0;i<ret.length;i++){
            ret[i] = iter.next();
        }
        return ret;
    }


}
