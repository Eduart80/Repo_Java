package Interview;

public class staticBlock {
    public static void main(String[] args) {
        System.out.println(Second.X);
        Second.pla();
    }
}

class Second {
    public static final int X = 123;

    static void pla(){
        System.out.println("text from static");
    }
    static {
        System.out.println("text static NOT VISIBLE");
    }

}
