package practice;

public class valueReference {
    public static void main(String[] args) {
        Operation op = new Operation();
        System.out.println("Before change "+op.data);
        op.change(500);
        System.out.println("After change "+ op.data);
        op.change(op);
        System.out.println("After After "+op.data);


    }
}
class Operation{
    int data = 50;

    void  change(int data){
        data = data + 100;
    }
    void  change(Operation op){
        data = data + 100;
    }
}
