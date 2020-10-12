package homeWork;

public class classMethod {
    public double myMath(int[] arr){
        double result = 0;
        for (int i=0; i< arr.length; i++ ){
            result = result + arr[i];
        }
        double res = arr.length;
        return res;
    }
    public double myMath2(double[] arr) {
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }
        return result;
    }
    public void findDub(String[] value, String value2){
        for (int i=0; i<= value.length-1; i++){
            if(value2.contains(value[i])){
                System.out.println(value[i]);
            }else{

            }
        }
    }
    public void findArrays(String[] value1, String[] value2,  String value3){
        for (int i=0; i<value1.length; i++){
            if(value3.contains(value1[i])){
                System.out.println(value1[i]);
            }
        }
        for (int i=0; i<value2.length; i++){
            if (value3.contains(value2[i])) {
                System.out.println(value2[i]);
            }
        }
    }
}
