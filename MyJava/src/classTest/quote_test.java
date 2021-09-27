package classTest;

public class quote_test {
    public static void main(String[] args) {
        String name = "Jon";
        System.out.printf("Is \"%s\"",find(name));
        //out put "hello jon" double quotes "%s"
    }
    public static String find(String name){
        return "Hello "+ name;
    }
}
