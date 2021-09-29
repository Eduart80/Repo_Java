package practice;

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
    }
}