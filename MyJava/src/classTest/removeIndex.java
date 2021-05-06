package classTest;

public class removeIndex {
    public static void main(String[] args) {
        int[] array= {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int number = 24;
        System.out.println("\nup "+ redo(array,number));

        }
    public static int redo(int[] arrays, int user){
        int result = 0;
        for(int i=0; i<arrays.length;i++){
            boolean isTrue = user==arrays[i];
            if(isTrue){
                continue;
            }else {
                result = arrays[i];
                System.out.print(arrays[i]+", ");
            }
        }
        return result;
    }










}
