package Interview;

public class defaultAccessMod {
    public static void main(String[] args) {
        System.out.println("from main");
        System.out.println( addMe());
        System.out.println(endIT());
    }
    static int addMe(){
         int numb = 1+2;
        return numb;
    }
    public static int endIT(){
        return 2+2;
       // System.out.println(res);
    }
}
