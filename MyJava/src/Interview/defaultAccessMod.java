package Interview;

public class defaultAccessMod {
    public static void main(String[] args) {
        System.out.println("from main");
        System.out.println( addMe());
    }
    static int addMe(){
         int numb = 1+2;
        return numb;
    }
}
