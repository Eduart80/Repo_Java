package classTest;

import java.util.Arrays;

public class test3 {

    public static void main(String[] args) {
        System.out.println( alterText("Albania"));
        int[] A = new int[]{2,3};
        int[] B = new int[]{4,5};
        System.out.println(Arrays.toString( merge(A, B)));
    }

    public static boolean isSpecial(String text){
        String tempText = alterText(text);
        return text.equals(tempText);
    }
// reverse string text
    private static String alterText(String inputText) {
        if(inputText == null || inputText.isEmpty()){
            return inputText;
        }
        return inputText.charAt(inputText.length()-1) + alterText(inputText.substring( 0, inputText.length()-1));
    }

// murge two arrays
       public static int[] merge(int[] a, int[] b){
            int[] result = new int[a.length + b.length];
            for (int i = 0; i < a.length; i++) {
                result[2 * i] = a[i];
                result[(2 * i) + 1] = b[i];
            }
            return result;
        }

}

