package classTest;

public class threeParameters {

    public static void main(String[] args) {

        System.out.println( name(190));

    }
    public static boolean name(int n){

        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }
}
