package practice;

public class myChild extends myParent {

    public int addNumbers(){
        return 2+1;
    }
    public void overLoad(int num1, int num2){
        if(num1<=num2){
            System.out.println("myChild, this number is small");
        }else  {
            System.out.println("myChild, this number is big");
        }
    }

}
