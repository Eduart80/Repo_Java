package homeWork;

public class homeWork_6 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 40, 30};
        System.out.println("length "+arr.length);
        System.out.println(arr[1] +arr[2] +arr[0] +arr[3] / arr.length);
        fillArray(arr);
//////////////////
        String type = "Tom,Link,Bing,Fin,Add";

        myM(type);

        System.out.println("My name is "+myToo());

        youR();


    }

    public static void fillArray(int[] arr) {
        int num = (arr[0] + arr[1] + arr[2] + arr[3]) / arr.length;
        System.out.println("mid numb "+ num);
    }
    ////Smple 1
    public static void myM(String type){
        String[] typeSplit = type.split(",");
        System.out.println("found arrays -> "+typeSplit.length);
        if(typeSplit[4].contains("Add")){
            System.out.println("true, this name is in file. "+typeSplit.length);
        }else {
            System.out.println("false, this name is NOT in file.");
        }
    }
    ////Sample 2
    public static String myToo(){
        String name = "Tom";
        //System.out.println("This is "+name);
        return name;
    }
    ///Sample 3
    public static void youR(){
        String time = "15:00 pm";   //string data
        int time2 = 35;            //int data
        System.out.println("Combination of String and Int "+time+" & "+time2+" seconds.");
    }


}
