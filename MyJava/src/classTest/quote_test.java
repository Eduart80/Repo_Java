package classTest;

public class quote_test {
    public static void main(String[] args) {
        String name = "Jon";
        System.out.printf("Is \"%s\"",find(name));
    }
    public static String find(String name){
        return "Hello "+ name;
    }
}
