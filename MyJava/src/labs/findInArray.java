package labs;

public class findInArray {
    public static void main(String[] args) {

        String[] school = {"John","Tom","Mike","Ethan"};
        String find = "Mike";
        System.out.println("Name "+find+"\nFound at index: "+findArray(school,find));

    }
    public static int findArray(String[] arr,String name){
        int nameIs = -1;
        for(int i=0; i<arr.length;i++){
            String namb = arr[i];
           boolean res = namb.equalsIgnoreCase(name);
            if(res){
                nameIs = i;
            }
        }
        return nameIs;
    }





}
