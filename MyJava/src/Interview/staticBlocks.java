package Interview;

public class staticBlocks {
    static {   //static block is running when class load
        System.out.println("from static block");
    }
    {  //Initialization is running when object of class is created
        System.out.println("Initialization block");
    }
    static void Testing(){  //Construction is running when object is created
        System.out.println("Constructor");
    }

    public static void main(String[] args){
        System.out.println("Main method");
        // Testing(); // remove testing() to see difference of system print
     }
}

