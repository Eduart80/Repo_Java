package aside;

import java.util.*;

public class joinntArray {


    private static String uniqueName(String[] names1 , String[] names2 ){ //, String[] names2

        String holdMe = "";
// =================== this use List Array  ======================================
//        ArrayList list1 = new ArrayList(Arrays.asList(names1));
//        ArrayList list2 = new ArrayList(Arrays.asList(names2));

//        for(int i=0; i < list1.size(); i++) {
//            if (!holdMe.equals(list1.get(i))) {
//                holdMe += " "+list1.get(i);
//            }
//        }
//        for(int i=0; i < list2.size();i++){
//            if(!holdMe.equals(list2.get(i))) {
//                holdMe += " "+list2.get(i);
//            }
//        }
// ================ this use Hash Set  ========================================

        HashSet<String> newSet = new HashSet<>();
        // newSet.addAll(Arrays.asList(names1));
        for (String s : names1) {
            newSet.add(s);
        }
        for (String s : names2) {
            newSet.add(s);
        }

        for(Object x : newSet){
            holdMe += " "+ x;
        }

        return holdMe;
    }

    public static void main(String[] args) {
        String[] name1 = new String[]{"Eva", "Emma", "Olivia","Ed"};
        String[] name2 = new String[]{"Tonia","Sophia", "Emma", "Olivia","Olivia","Ed"};
        System.out.println(uniqueName(name1,name2));
//        System.out.println(String.join(",", joinntArray.uniqueName(name1,name2)));
    }


}
