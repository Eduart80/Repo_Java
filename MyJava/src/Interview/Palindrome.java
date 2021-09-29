package Interview;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("anna"));
        System.out.println(isPalindrome("Kajak"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("5"));
    }

    private static boolean isPalindrome(String name) {
        String rev = reverse(name).toLowerCase();
        if(name.toLowerCase().equals(rev)){
            return true;
        }else{
            return false;
        }
    }

    private static String reverse(String input) {
        if(input == null || input.isEmpty()){
            return input;
        }
        return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length()-1));
    }
}
