package Interview;

public class intToRomanNumbers {
    // convert int to Roman numbers
//    I = 1
//    V = 5
//    X =10
//    L = 50
//    C = 100
//    D = 500
//    M = 1000
    public static void main(String[] args) {
        System.out.println( romanNumbers(2014));
    }
    public static String romanNumbers(int num) {
        String[] thousands = new String[]{"A","M","MM","MMM"};
        String[] hundreds = {"A","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] tens = {"A","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] units ={"A","I","II","III","IV","V","VI","VII","VIII","IX"};
        return thousands[num / 1000]+
                hundreds[(num % 1000) / 100]+
                tens[(num % 100) / 10]+
                units[num % 10];
    }
}

