package constructorClass;

public class cons2Main {
    public static void main(String[] args){
        String name= "firstName";
        String last = "lastName";
        int age = 20;
        int account = 1;

        cons2Method person = new cons2Method(name, last, age,account);

        System.out.println(person.firstName+" "+person.lastName+", age of "+person.age+", account #"+person.account);
        person.eat();
    }
}
