package labs;

public class job_intervieus {
    public static void main (String[] arg){

        //reverse words in a string
        String nameA = "hello WORLD how are you";
        nameA = nameA.toLowerCase();
        String[] nameSplit = nameA.split("");
        for (int i=nameSplit.length-1; i>=0;  i--) {
            System.out.print(nameSplit[i]);
        }
        System.out.println("\n");
        //inkrement
        int a = 20 ;
        a++;                        //increment by 1
        System.out.println("a++ "+a++);    //stay the same
        System.out.println("a++ "+a++);    //increment by 1
        System.out.println(++a+" ++a");    //increment by 2
        System.out.println("a-- "+a--);    //stay the same
        System.out.println("a-- "+a--);    //decrement by 1
        System.out.println(--a+" --a");    //decrement by 2
        System.out.println(++a+" ++a");    //increment by 1

    }
}
