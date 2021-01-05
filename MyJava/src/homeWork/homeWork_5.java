package homeWork;

public class homeWork_5 {
    public static void main(String[] args) {
        // Subject - Homework-5

        /**
         * Write code/method to return abbreviation for any given string
         */
        String msg = "Outfit of the day";
        String[] msgSplit = msg.split(" ");
        for (String intoLoop : msgSplit) {
            System.out.print(intoLoop.substring(0, 1).toUpperCase());
        }

        /////// separator 0
        System.out.println("\n");

        String mssg = "Outfit of the day";
        String abr = "";
        String[] word = mssg.toUpperCase().split(" ");
        for (int i=0; i<=word.length-1; i++){
            abr = abr + word[i].charAt(0);
        }
        System.out.println("Message revers: "+abr);

        /////// separator 1
        System.out.println("\n");
        /// first capital letter, and the rest lowerCase

        String line = "i dId tHiS";   //  Once Upon A Time In The Universe
        System.out.println("Line (Before modification) : " + line);
        line = line.toLowerCase();
        String[] lineSplit = line.split(" ");
        String returnNormal = "";

        for (int i = 0; i <= lineSplit.length - 1; i++) {
            String modification = lineSplit[i].substring(0, 1).toUpperCase();
            String mod2 = lineSplit[i].substring(1);
            returnNormal = returnNormal + " " + modification + mod2;    //ad space in front of first letter
            //System.out.println(theWord);
        }
        System.out.println("Line After: "+ returnNormal.trim());    //trim to remove space in the first word

        /////// separator 2
        System.out.println("\n");

        /**
         * reverse a string
         */
        String message = "happy holidays"; //syadiloh yppah
        message = message.toUpperCase();
        String[] mesSplit = message.split("");
        for (int i = mesSplit.length-1; i>=0; i--){
           // int findD = message.length()-1;
            //char dd = message.charAt(findD);
            System.out.print(mesSplit[i]);
        }

        /////// separator 3
        System.out.println("\n");

        String message2 = "dog and cat"; //syadiloh yppah
        message2 = message2.toLowerCase();
        String[] mesSplit2 = message2.split("");
        String storeIt = "";

        for (int i = mesSplit2.length-1; i>=0; i--){
            char dd = message2.charAt(i);
            storeIt = storeIt + dd;
        }
        System.out.println("Last revers: "+storeIt);



    }
}

