package classTest;

public class test3 {

//    public static void main(String[] args) {
//        System.out.println(is"12345Ha");
//    }



    public boolean isSpecial(String text){
        String tempText = alterText(text);
        return text.equals(tempText);
    }

    private String alterText(String inputText) {
        if(inputText == null || inputText.isEmpty()){
            return inputText;
        }
        return inputText.charAt(inputText.length()-1) + alterText(inputText.substring( 0, inputText.length()-1));
    }


       public int[] merge ( int[] a, int[] b){
            int[] result = new int[a.length + b.length];
            for (int i = 0; i < a.length; i++) {
                result[2 * i] = a[i];
                result[(2 * i) + 1] = b[i];
            }
            return result;
        }

}

