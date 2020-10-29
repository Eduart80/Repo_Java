package labs;

public class field_variable {

    static int resCapacity = 50;
    static int resOccupancy = 0; //10

    public static void main(String[] args) {
        incomingGuest(2);
        leavingGuest(3);
//        int totalProfit = myNJBusiness(100, 40, 10) + myNYBusiness(120, 50, 12);
//        System.out.println("Total profit " + totalProfit);
//        if(myBoolean(80)){
//            System.out.println("This student passes");
//        }else
//            System.out.println("Student failed.");
    }
    public static void incomingGuest(int guest){
        resOccupancy = resOccupancy + guest;
        int remainingCapacity = resCapacity - resOccupancy;
        System.out.println("Remaining capacity is " + remainingCapacity);
    }
    public static void leavingGuest(int guestNo){
        resOccupancy = resOccupancy - guestNo;
        int remainingCapacity = resCapacity - resOccupancy;
        System.out.println("Remaining capacity is " + remainingCapacity);
    }
//    public static boolean myBoolean(int mark){
//        boolean isPass = false;
//        if (mark>70){
//            isPass = true;
//        }
//        return isPass;
//    }
////
//    public static int myNJBusiness(int income, int salary, int tax){
//        int result = (income - salary) - tax;
//        System.out.println("Result " + result);
//        return result;
//    }
//
//    public static int myNYBusiness(int income, int salary, int tax){
//        int result = (income - salary) - tax;
//        System.out.println("Result " + result);
//        return result;
//    }
//    public static void myCalculation(int valOne, int valTwo, int valThree){
//        int result = valOne + valTwo + valThree;
//        System.out.println("Result " + result);
//    }
//    public static void myCalculation(int valOne, int valTwo){
//        int result = valOne + valTwo;
//        System.out.println("Result " + result);
//    }
//
//    public static void myCalculation(int valOne, int valTwo){
//        int result = valOne + valTwo;
//        System.out.println("Result is " + result);
//    }
}
