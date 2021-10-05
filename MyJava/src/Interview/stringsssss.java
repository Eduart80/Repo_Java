package Interview;

public class stringsssss {

    static class Result {
        public static boolean compareStrings(String s1, String s2) {
            // Write your code here
            int bs1, bs2, ou;

            bs1 = -1;

            for(int i=0;i<=s1.length();i++){
                if(s1.charAt(i) == '#' ){
                    bs1 -= 1;

                }else if(s1.charAt(i)!= '#' ){
//                    s1.setCharAt(bs1 + 1, s1.charAt(i));

                    bs1 += 1;
                }
            }

            bs2 = -1;
            for(int i=0;i<=s2.length();i++){
                if(s2.charAt(i) == '#' ){
                    bs2 -= 1;

                }else if(s2.charAt(i)!= '#' ){
//                    s2.setCharAt(bs2 + 1, s2.charAt(i));
                    bs2 += 1;
                }
            }


            if(bs1 != bs2){
                return false;
            }else if(bs1 == -1 && bs2 == -1){
                return true;
            }else{
                for(int i=0;i<=bs2;i++){
                    if(s1.charAt(i) != s2.charAt(i)){
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
    }
    public static class Solution {
//        public static void main(String[] args) throws IOException {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            String s1 = bufferedReader.readLine();
//
//            String s2 = bufferedReader.readLine();
//
//            int result = Result.compareStrings(s1, s2);
//
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//
//            bufferedReader.close();
//            bufferedWriter.close();
//        }
    }

}
