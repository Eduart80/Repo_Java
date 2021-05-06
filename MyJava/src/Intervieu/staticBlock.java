package Intervieu;

public class staticBlock {
    public static void main(String[] args) {
        System.out.println(Second.X);
    }
}

class Second {
    public static final int X = 123;

    static {
        System.out.println("text from static");
    }

}
