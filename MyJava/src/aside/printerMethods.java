package aside;

import java.util.Scanner;

public class printerMethods {

    protected int toner = 5;
    protected int page = 1;

    public void Levels(){
        int tonerL = toner;
        int pageL = page;
        System.out.println("Printer status: Papers "+pageL+" : Toner "+tonerL);
    }

    public void inkFill(int userfill){
        toner= toner + userfill;
        if(toner>100){
            System.out.println("Wrong entry");
            Scanner input = new Scanner(System.in);
            System.out.println("Please try it again : ");
            int inputInk2 = input.nextByte();
                if(toner>100){
                    System.out.println("Please call a technician.");
                    System.exit(0);
                }
                }else if(toner <= 0) {
                System.out.println("Wrong entry");
                Scanner input = new Scanner(System.in);
                System.out.println("Please try it again : ");
                int inputInk3 = input.nextByte();
                    if (toner <= 0) {
                        System.out.println("Please call a technician.");
                        System.exit(0);
                    }
                    }else{

                        System.out.println("New toner level "+toner);
                    }

    }
    public void paperFill(int userFill){
        page= page + userFill;
        if(page>100){
            System.out.println("Wrong entry");
            Scanner input = new Scanner(System.in);
            System.out.println("Please try it again : ");
            int inputPaper2 = input.nextByte();
                if(page>100){
                    System.out.println("Please call a technician.");
                    System.exit(0);
                }
        }else if(page <= 0) {
            System.out.println("Wrong entry");
            Scanner input = new Scanner(System.in);
            System.out.println("Please try it again : ");
            int inputPaper3 = input.nextByte();
                if (page <= 0) {
                    System.out.println("Please call a technician.");
                    System.exit(0);
                }
                }else{
                    System.out.println("New paper level "+page);
                }
    }
    public void userPageUsed(int newEntry){
        page = page - newEntry;
        System.out.println("Paper count left "+page+" pages");
        if(page<=0){
            System.out.println("Paper tray is empty "+page);
        }
    }
    ///Single page use
    public void userInkUsed(int newEntry){
        toner = toner - newEntry;
        System.out.println("Toner level "+toner);
        if(toner<10){
            System.out.println("Ink level Low, please refill toner.");
        }
    }
    /// double pages use
//              (newEntry *2 + 1) this is usefull for numrat tek
//            (newEntry *2) this is used with numrat double
    public void userInkDouble(int newEntry){
        toner = toner - (newEntry *2 + 1);
        System.out.println("Toner level "+ toner);
        if(toner<10){
            System.out.println("Ink level Low, please refill toner.");
        }
    }
    public void inkUpdate(){
        if(toner<=0){
            toner=0;
        }
    }
    public void paperUpdate(){
        if(page<=0){
            page=0;
        }
    }
}
