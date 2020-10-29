package classWork;

public class turnery {
    public static void main(String[] args) {


        int numb = 55;
        double myNumb = numb>100?1.0:2.0;
            System.out.println("Your point is " + myNumb);

        int time = 13;
        String myTime = time<12?"Good morning!":"Good afternoon!";
        System.out.println("Hey..  " + myTime);

        int ask =13;
        boolean meSay = ask>=12?ask==12:true;
        System.out.println("Whaaat "+ meSay);

        int myResult = time<12?time:++time;
        System.out.println("look "+ myResult);

    }
}
