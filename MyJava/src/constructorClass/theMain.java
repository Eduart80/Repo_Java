package constructorClass;

public class theMain {
    public static void main(String[] args) {
            theMethods a1 = new theMethods("Ben","Checking","00112233");
            a1.miniInfo();
            theMethods a2 = new theMethods("Jon", "Saving", "2222");
            a2.miniInfo();
            theMethods a3 = new theMethods("Sam", "Saving", "3333");
            a3.miniInfo();


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
        int[] ho = {3,4,7,9,22,5,1,55};
        findMax(ho);

}/////end of Main

    public static void findMax(int[] count){
        int result = 0;
        for (int i=0; i<count.length; i++){
            if(result<count[i]){
                result = count[i];
            }
        }
        System.out.println("result "+result);
    }
}
