package practice;

public class myParent {
    public myParent(){  /// Constructor, default entry , no need to call from main
        System.out.println("Default message from myParent class constructor");
    }
    public void defName(){   /// method
        System.out.println("Hello from parent");
    }
    public void overLoad(int num1, int num2){
        if(num1<num2){
            System.out.println("this number is small");
        }else  {
            System.out.println("this number is big");
        }
    }
    /// 3 types of Polymorphism
    public double addNumbers(double num1,int num2){  // same name but different argument
        double a = 2.2;
        int b = 3;
        return a+b;
    }
    public int addNumbers(int num1,int num2){//same name but different data-type
        int a = 2;
        int b = 3;
        return a+b;
    }
    public double addNumbers(int num1,double num2){//same name but different argument position
        int a = 2;
        double b = 3;
        return a+b;
    }
    public int addNumbers(){
        return 2+8;
    }

    /// Convert int numbers to string
    public String returnString(int num){
    String tString = String.valueOf(num);
    String[] tSplit = tString.split("");
    String rev = "";
        for (int i = tSplit.length-1; i>=0 ; i--){
        rev = rev + tSplit[i];
    }
        //System.out.println(rev);
        return rev;
    }

}
