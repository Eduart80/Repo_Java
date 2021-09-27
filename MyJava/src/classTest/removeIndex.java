package classTest;


import java.util.Arrays;

public class removeIndex {
    // remove array index by using value
    // int number refer to the value u need to remove
    // to work correctly need to create  int[]  array = new int[]{ values };

    public static void main(String[] args) {
        int[] array= {32, 14, 24, 98, 56, 148,56, 24, 78, 2};
        int number = 32;
        System.out.println("\nup "+ redo(array,number));
        System.out.println(Arrays.toString(array));

        }
    public static int redo(int[] arrays, int user){
        int result = 0;
        for(int i=0; i<arrays.length;i++){
            boolean isTrue = user==arrays[i];
           if(!isTrue){
               result = arrays[i];
               System.out.print(arrays[i]+", ");
           }else if(isTrue){

               continue;
           }else{
               System.out.println("No such number");
           }
        }
        return result;
    }










}
