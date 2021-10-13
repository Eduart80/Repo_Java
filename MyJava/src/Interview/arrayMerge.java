package Interview;

import java.util.*;

public class arrayMerge {

    public static void main(String[] args) {
        String[] names1 = new String[] {"Eva", "Emma","zed", "Eva", "Olivia"};
        String[] names2 = new String[] {"God","Olivia", "Sophia","Eva", "Emma", "God"};
        System.out.println(uniqueNames(names1,names2) );
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
        for (int i = 0; i < a.length; i++) {
            result[2 * i] = a[i];
            result[(2 * i) + 1] = b[i];
        }
        return result;
    }
}
