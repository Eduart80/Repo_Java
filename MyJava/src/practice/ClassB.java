package practice;

/**
 * Class A is Interface
 * Class B implement Class A
 * Class C extend Class B
 * Class D is abstract
 */
public class ClassB implements ClassA{

    @Override
    public void init() {
        System.out.println("lol 1");
    }

    @Override
    public void notWell() {
        System.out.println("lol 2");
    }

    @Override
    public void doli() {
        System.out.println("lol 3");
    }
    public static void moli(String name){
        System.out.println(name );
    }
}
interface ClassA{
    public void init();
    public void notWell();
    void doli();

}
class ClassC extends ClassB{
    public static void main(String[] args) {
        ClassB aa = new ClassB();
        aa.init();
        aa.notWell();
        aa.doli();
        ClassB.moli("Moli");

        ClassE ee = new ClassE();
        System.out.println("Field variable = "+ee.abc);
        ee.animal("Tomy");
        ee.normal();
    }
}
// abstract class
abstract class ClassD extends ClassB{
    String abc= "Abs";
    //abstract method
    public abstract void animal(String name);
    //normal method
    public void normal(){
        System.out.println("From abstract method Class D");
    }

}
class ClassE extends ClassD{
    @Override
    public void animal(String name) {
        name = "tom";
        System.out.println("Animal name is = "+name);
    }
}
