package Interview;

import java.util.Stack;

public class backspaceInStrings {
    private static int backSpace(String s1, String s2){
        boolean res = reform(s1).equals(reform(s2));
        if(res){
            return 1;
        }return 0;
    }

    private static String reform(String S){
        char sArr[] = S.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < sArr.length; i++){
            if(sArr[i] == '#' && !stack.isEmpty()){
                stack.pop();
            }
            if(sArr[i] != '#'){
                stack.push(sArr[i]);
            }
        }
        return String.valueOf(stack);
    }

    public static void main(String[] args) {
        System.out.println(backSpace("ab#c", "ab#c"));
        System.out.println(backSpace("cc#s","abc"));
        System.out.println(backSpace("a#bc","h#bc"));
    }

}
