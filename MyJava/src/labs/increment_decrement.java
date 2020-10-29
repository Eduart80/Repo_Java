package labs;

public class increment_decrement {
    public static void main(String[] args) {

        int numb=2;
        numb++;
        System.out.println(numb++); //3  take # 2 + 1 and store value
        System.out.println(++numb); //5   increment by 1 and + 1 to store  new value of 5

        int numb2=3;
        numb2++;
        System.out.println("int 2= "+numb2++);  //4
        System.out.println(numb2--);             //5

        int numb3 = 5;
        numb3++;
        System.out.println("int 3 = "+numb3++); //6
        System.out.println(--numb3);            //6

        int numb4 = 1;
        numb4--;
        System.out.println("int 4 = "+numb4--); //
        System.out.println(--numb4);            //-2

        int numb5 = 2;
        numb5++;
        System.out.println("int 5 = "+numb5--); //3
        System.out.println(numb5++);            //2
////////////////////////////////////////////////////////////////
        int numb6 = 4;
        //numb6++;
        System.out.println("int 6 = "+(++numb6)); //5
        System.out.println(numb6--);            //5


    }

}
