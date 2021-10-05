package practice;

import java.util.Scanner;

public class primitiveRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                else if(x>=-32768 && x<=32768)System.out.println("* short");
                else if(x>=-2147483647 && x<=2147483647)System.out.println("* int");
                else if(x>=-9223372036854775808L && x<=9223372036854775807L)System.out.println("* long");
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
