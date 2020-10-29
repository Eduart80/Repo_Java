package Object_Classes;

public class methodLink {
////Math , mblidh vlera ne int Array
    public double myMath(int[] arr){
        double result = 0;
        for (int i=0; i< arr.length; i++ ){
            result = result + arr[i];
        }
        double res = arr.length;
        return res;
    }
    ////Math , mblidh vlera ne double array
    public double myMath2(double[] arr){
        double result = 0;
        for (int i=0; i<arr.length;i++){
            result= result + arr[i];
        }
        return result;
    }

////Math plus
    public int toAdd(int num1, int num2){
        return  num1 + num2;
    }
/////Math minus
    public int toSub(int num1, int num2){
        return  num1 - num2;
    }
    public int toMulti(int num1, int num2){
        return num1 * num2;
    }
////// Math pjestim
    public double toDiv(int num1, int num2){
        double res = 0;
        if(num2 != 0)
            res = num1*1.0 / num2;
        return res;
    }
/////////// find if a name is present in 2 ARRAYS
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
