package classWork;

public class if_loop {

    public static void main(String[] args) {

        //int = 2;
        for (int i=0; i<=2; i++) {
            System.out.println("hiiii "+i);
        }

        ///////////////
        String[] name = {"0","1","2","3","4","5","6","7","8","9"};
        for (int i=0 ; i<=name.length-1 ; i++) {
            if (i % 2 == 0) {                            // i<4 0,1,2,3
                System.out.println(name[i]);
            }           // i    0,1,2,3
        }

         /*
            print the values present in even index      (0,2,4,6,8,...)
         */
    }
}
