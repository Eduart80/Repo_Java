package labs;

public class findBigestNumb {
    public static void main(String[] args) {
        int[] school = {-1,2,55,4,11,14 };
        System.out.println("The highest number is: "+ findBig(school));

    }
    public static int findBig(int[] array){
        int result = array[0];
        for (int i=0; i<array.length;i++){
            if(array[i] > result){
                result = array[i];
            }
        }
        return result;
    }



}
