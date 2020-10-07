package homeWork;

public class homeWork_6 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 40, 30};
        System.out.println(arr.length);
        System.out.println(arr[1] +arr[2] +arr[0] +arr[3] / arr.length);
        fillArray(arr);
    }

    public static void fillArray(int[] arr) {
        int num = (arr[0] + arr[1] + arr[2] + arr[3]) / arr.length;
        System.out.println("mid numb "+ num);
    }
}
