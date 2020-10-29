package labs;

public class do_while {
    public static void main(String[] args) {
    //          for(int age = 1; age<=5; age++){
    //          System.out.println(age);
    ////        System.out.println("Mohi");
    //          int[] marks = {10, 20, 30};
    //          for (int m: marks){
    //          System.out.println("text" + m);
        int price = 10;
        while (price<15){
            System.out.println("Anna");
        price++;
        }

        int abc = 10;
        do {
            System.out.println(abc);
            abc++;
        } while (abc<=15);

        int abc7 = 10;
        do {
            System.out.println(abc);
            abc++;
        } while (abc7<=20);
/////////////////////////////////////////////////////////////////////////////////////////

        String name = "JakaRia";
//    name = "Shawon";
//    if(name.equalsIgnoreCase("jakaria")) {
//        System.out.println("Jakaria is here");
//        System.out.println("J is here");
//    } else
//        System.out.println("Jakaria is not here.");
//    String classModel = "Online";
//    String instructor = "Deepak";
//
//    if(classModel.equalsIgnoreCase("online")){
//        System.out.println("Be ready for Zoom session.");
//        if(instructor.equalsIgnoreCase("Deepak")) {
//            System.out.println("Go Deepak's Lab");
//        } else
//            System.out.println("Go Ahsan's Lab");
//    } else if (classModel.equalsIgnoreCase("hybrid")){
//        System.out.println("You have options to choose.");
//    }
//    else {
//        System.out.println("Be ready for travel to Campus.");
//    }
        /** Football: Shawon, Eduart, Mamta, Pavlo
         Cricket: Jakaria, Mohi, Nusrat, Ahsan
         Basketball: Balzhima, Tim
         Others: Anna
         * Store fan name in a variable
         * Complete If/Else coding
         * Wanna see 'Shawon is fan of Football'
         */
        // Switch
        // Variable we can use in switch: String, int, byte, short, char
        switch(name.toLowerCase()) {
            case "jakaria":
                System.out.println("Jakaria");
                break;
            case "tim":
                System.out.println("Tim");
                break;
            default:
                System.out.println("Some other name.");
        }
    }
}
