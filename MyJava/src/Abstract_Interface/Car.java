package Abstract_Interface;

public abstract class Car{
    //have abstract and non abstract methods
    //
    public abstract void serial();

    public void model(){
        System.out.println("Model BMW");
    };
    public void color(){
        System.out.println("blue");
    }
    public static void colorWhite(){
        System.out.println("White");
    }
}
