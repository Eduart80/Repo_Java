package Interview;

public class findBigNumbArray {
    /**
     * find the biggest number from given int array
     *
     * start counting from index-0 with for loop
     * increment by 1
     * if found store int
     * in the loop if count is bigger than result
     * update
     * return result
     */
    public static void main(String[] args) {
        int[] ho = {3,4,7,9,22,5,1,55};
        findMax(ho);
    }
    public static void findMax(int[] count){
        int result = 0;
        for (int i=0; i<count.length; i++){
            if(result < count[i]){
                result = count[i];
            }
        }
        System.out.println("result "+result);
    }
}
