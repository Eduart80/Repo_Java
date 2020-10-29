package classWork;

public class charAtsample {
    public static void main(String[] args) {

        String hello = "Hi my name is Tom";
        char lastIndexChar;
        int len = hello.length();
        int lastIndex = len-1;
        lastIndexChar = hello.charAt(lastIndex);
        System.out.println(lastIndexChar);
    }
}
