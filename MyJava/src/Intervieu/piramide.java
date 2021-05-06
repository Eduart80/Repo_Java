package Intervieu;

public class piramide {

    public static void main(String[] args) {
        //make a christmas tree with (*)

        for (int i=1; i <= 5 ; i++){
            for (int j=4; j >= i ; j--){ //1 < 3 / 2<3/ 3<=3/ 4<3
                System.out.print(" ");
            }
            for (int k=1; k<= i ; k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
