package Abstract_Interface;

public class testBMW {
    public static void main(String[] args) {
        BMW bb = new BMW();
        bb.serial();
        bb.veni();
        bb.model();
        bb.color();

        // access directly from class name to method
        Car.colorWhite();
        Car f = new BMW();
        f.color();
    }
}
