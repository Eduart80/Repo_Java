package practice;

public class palindromeInt {
    public static void main(String[] args) {
        int asd = 123;
        int qwe = 1221;
        int zxc = 1451;
        int qaz = 0;
        System.out.println("Int 0 : "+ palindrome(qaz));
        System.out.println("Int 1 : "+ palindrome(asd));
        System.out.println("Int 2 : "+ palindrome(qwe));
        System.out.println("Int 3: "+ palindrome(zxc));
    }
    public static boolean palindrome(int x){
        if(x <= 0 ) return false;
        int entry = x;
        int rev = 0;
        int originalNmr = x;

        while(entry != 0){
            int r = entry % 10;
            rev = rev * 10 + r;
            entry /= 10;
        }
        if(originalNmr == rev){
            return true;
        }else {
            return false;
        }

    }
}
