package classWork;

public class for_Loop {
    public static void main(String[] args) {

        /**
         * Write code/method to return abbreviation for any given string
         */
        String msg = "Outfit of the day";
        String[] msgSplit = msg.split(" ");
        for (String intoLoop : msgSplit) {
            System.out.print(intoLoop.substring(0, 1).toUpperCase());
        }

        /////// separator 1
        System.out.println("\n");

        String line = "i dId tHiS";   //  Once Upon A Time In The Universe
        System.out.println("Line (Before modification) : " + line);
        line = line.toLowerCase();
        String[] lineSplit = line.split(" ");

        for (int i = 0; i <= lineSplit.length - 1; i++) {
            String modification = lineSplit[i].substring(0, 1).toUpperCase();
            String mod2 = lineSplit[i].substring(1);
            String theWord = modification + mod2;
            System.out.println(theWord);
        }

        /////// separator 2
        System.out.println("\n");

        /**
         * reverse a string
         */
        String message = "happy holidays"; //syadiloh yppah
        message = message.toUpperCase();
        String[] mesSplit = message.split("");
        for (int i = mesSplit.length-1; i>=0; i--){
            //int findD = message.length()-1;
            //char dd = message.charAt(findD);
            System.out.println(mesSplit[i]);
        }
//        String message = "happy holidays"; //syadiloh yppah
//        message = message.toUpperCase();
//        //String[] mesSplit = message.split("");
//        for (int i = mesSplit.length-1; i>=0; i--){
//            int findD = message.length()-1;
//            char dd = message.charAt(findD);
//            System.out.print(mesSplit[i]);
//        }


        String nameA = "hello WORLD how are you";
        nameA = nameA.toLowerCase();
        String[] nameSplit = nameA.split("");
        for (int i=nameSplit.length-1; i>=0;  i--) {
            System.out.print(nameSplit[i]);
        }

        double[] value = {10.3, 0.25,55,9.7};
        double result = 0;
        for (int i=0; i<value.length;i++){
            result= result + value[i];
        }
        /*
    /// from 10 to 1
        int[] abc = {1,2,3,4,5,6,7,8,9,10};
        for (int i=abc.length; i>0; i--){
            System.out.println(i);
        }

        char[] abcc = {'a','c','d','e','f','g'};
        for ( char i=0 ; i<=abcc.length; i++ ){
            System.out.println(abcc[i]);
        }
       /* char[] abcc2 = {'a','c','d','e','f','g'};
        for ( char name : abcc2) {
            System.out.println(name);
        }
        //char[] abcc3 = {'a','c','d','e','f','g'};
        //while ( char abcc3<0) {
         //   System.out.println(abcc3);
           // abcc++;
           */
    }
}
