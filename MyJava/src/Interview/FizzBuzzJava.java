package Interview;

public class FizzBuzzJava {
    public void test(int n) {
        int count = 1;
            for (int i = 0; i <= n-1; i++) {
                if (count % 3 == 0 && count % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (count % 3 == 0) {
                    System.out.println("Fizz");
                } else if (count % 5 == 0) {
                    System.out.println("Buzz");
                }
                System.out.println(count);
                count++;
        }
    }

    public static void main(String[] args) {
        FizzBuzzJava t = new FizzBuzzJava();
       t.test(15);
    }
}
