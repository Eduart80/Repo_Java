package labs;

public class labOne {
    public static void main(String[] args) {

        // find if given number is even or odd
        int num = 10;
        boolean isEven = (num %2 == 0);
        System.out.println(num + " is even: " + isEven);

        // convert Miles to km
        //model 1
        int mile = 3, km =5 ;
        double kmInMile = 1.61;
        double mileInKm = mile * kmInMile;
        boolean isTrue = mileInKm == km;

        System.out.println("Is 3 miles equal to 5km ? " + isTrue);

        //model 2
        double kNum = 1.60;
        boolean mIsEqal = ((kNum * 3) == 5);
        System.out.println("is 3 miles equal to 5km? => " + mIsEqal);




    }
}
