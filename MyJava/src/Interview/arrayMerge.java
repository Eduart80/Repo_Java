package Interview;

import java.util.*;

public class arrayMerge {

    public static void main(String[] args) {
        String[] names1 = new String[] {"Eva", "Emma","zed", "Eva", "Olivia"};
        String[] names2 = new String[] {"God","Olivia", "Sophia","Eva", "Emma", "God"};
        System.out.println(uniqueNames(names1,names2) );
//        int[] A = {1,2,2};
//        int[] B = {3,4,5};
//        System.out.println("Int res: "+ Arrays.toString(merge(A, B)));
    }
    // string arrays
    public static Set<String> uniqueNames(String[] names1, String[] names2) {
        Set<String> unicName = new HashSet<>();
        for (String dd : names1) {
            unicName.add(dd);
         }
        for (String dd : names2) {
            unicName.add(dd);
        }
        return unicName;
    }

    // merge two int arrays
    public static int[] merge(int[] a, int[] b){
        int[] result = new int[a.length + b.length];
        for (int i = 0; i <= result.length; i++) {
            if(a.length == 3){
                result[2 * i] = a[i];
            }
            if(b.length == 3){
                result[(2 * i) + 1] = b[i];
            }
        }
        return result;
    }
}
