package labs;

public class testing {
    public static void main(String[] args) {

        String[] moli = {"bla", "vla", "mla", "tala", "Top"};
        String aba = "Top";

        for (int i=0; i< moli.length;i++){
            if (moli[i].equals(aba)){
                System.out.println("in 1 "+moli[i]);
            }else if(!moli[i].equals(aba)) {
                System.out.println("In 2 "+aba);
            }
        }


    }
}
