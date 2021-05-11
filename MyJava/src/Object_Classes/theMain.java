package Object_Classes;

import sampleWork1.classMethod;

public class theMain {
    public static void main(String[] args) {
            classMethod a1 = new classMethod();
            methodLink aa2 = new methodLink();

            ///// first
            int[] note = {230, 440, 1012, 88, 90};
            double thought = a1.myMath(note);
            System.out.println("first "+thought);

            //double
            double[] value = {10.3, 0.25,55,9.7};
            double result = 0;
            for (int i=0; i<value.length;i++){
                result= result + value[i];
            }
            double outvalue = a1.myMath2(value);
            System.out.println("second "+outvalue);

            methodLink a2 =new methodLink();
            int sum = a2.toAdd(5, 5);
            System.out.println(sum);

            double s1 = a2.toDiv(2,5);
            System.out.println(s1);

            String[] arr1 = {"start", "peace", "happy" , "hello", "Happy", "hello", "laugh"};
            String[] arr2 = {"hello", "grow", "laugh" , "peace","end"};
            String find = "start, peace, laugh, end";
            System.out.println("NAME FOUND: ");
            aa2.findArrays(arr1, arr2, find);



    }
}
