package practice;

public class main {
    public static void main(String[] args) {
        myChild a1 = new myChild();

         myParent c1 = new myChild();

        System.out.println("from myParent "+c1.addNumbers(2.3,6));
                System.out.println("from myParent "+c1.addNumbers(3,8.1));
                System.out.println("myChild "+ a1.addNumbers());
                System.out.println("myChild "+ a1.addNumbers());
                int num = 12345;
                System.out.println("myParents return "+ a1.returnString(num));


        int[] helo = {2,2,5,66,1};
        arrayTest b1 = new myChild();
        System.out.println("from arrayTest "+b1.copyOf(helo));
    }
}
