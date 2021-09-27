package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayMerge {

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma","zed", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println( uniqueNames(names1, names2));

        //System.out.println(String.join( ", ", mut));
        // should print Ava, Emma, Olivia, Sophia
    }
    // string arrays
    public static List<String[]> uniqueNames(String[] names1, String[] names2) {

//        List<String> mut = Arrays.asList(names1);
//             mut.add(Arrays.toString(names2));
        List<String[]> nn = new ArrayList<>(Collections.singleton(names1));
        nn.add(names2);
//        String[] ss = nn.toArray(String[]::new);
//        System.out.println(Arrays.toString(ss));
        return nn;
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
