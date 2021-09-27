package practice;

public class AutoboxingUnboxing {
    // java autoboxing and unboxing
    // convert a primitive nomber into non-primitive
   static void show(int i){
       System.out.println("INT number");
   }
   static void  show(Integer i){
       System.out.println("Integer number");
   }

    public static void main(String[] args) {
        short s = 2;
        show(s);
    }
}
