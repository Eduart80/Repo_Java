package constructorClass;

public class cons2Method {

    String firstName;
    String lastName;
    int age;
    int account;

    cons2Method(String firstName, String lastName, int age, int account){

        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
        this.age = age;
    }

    void eat(){
        System.out.println(this.firstName + " is here");
    }
}
