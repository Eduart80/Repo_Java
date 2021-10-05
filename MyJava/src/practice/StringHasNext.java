package practice;

import java.util.Scanner;

// multi lines of text
// text line 1
// text line 2
// text line 3
// it will read all as shown.  nextLine read all row
// has next() look if there is any text after
public class StringHasNext {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count =0;
        while (scan.hasNext()) {
            count++;
            System.out.println(count+" "+scan.nextLine());
        }

    }
}
