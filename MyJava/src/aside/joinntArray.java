package aside;

import java.util.*;

public class joinntArray {


    private static String uniqueName(String[] names1 , String[] names2 ){ //, String[] names2

        ArrayList list1 = new ArrayList(Arrays.asList(names1));
        ArrayList list2 = new ArrayList(Arrays.asList(names2));

        String holdMe = "";
        for(int i=0; i < names1.length;i++) {
            if (holdMe.equals(names1[i])) {
                list1.add(holdMe);
            }
        }
        for(int i=0; i < names2.length;i++){
            if(holdMe.equals(names2[i])){
                list2.add(holdMe);
            }
        }
        for(Object x : list1){
            holdMe = (String) x;
        }

//        Set newSet = new HashSet();
//        newSet.add(list1);
//        newSet.add(list2);
//        System.out.println("AAA"+holdMe);
//
//
//        for(Object x : newSet){
//            holdMe =  x;
//        }



        return holdMe;
    }

    public static void main(String[] args) {
        String[] name1 = new String[]{"Eva", "Emma", "Olivia"};
        String[] name2 = new String[]{"Tonia","Sophia","Olivia"};
        System.out.println(uniqueName(name1,name2));
//        System.out.println(String.join(",", joinntArray.uniqueName(name1,name2)));
    }


}
