package classTest;

public class myMethods {

    public int findDelete(int[] array, int user) {
        int missing = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println(i);
            if(user == array[i]) {
                missing = array[i];
                System.out.println("found " + missing);
            }
        }
        return missing;
    }
     public  int findMissing(int[] arr){
        int missing = 0;

        for(int i=0; i<arr.length ; i++) {
             missing = arr[i];
             missing= arr[i]+1;
        }
         System.out.println("lesh "+missing);
        return missing;
     }


    public int speedLimit = 70;
    public int over  =5;
    public int point = 12;

    public int speed(int user){
        speedLimit = user;
        return speedLimit;
    }
    public int getSpeedLimit(int num) {
        if (num < 70) {
            return speedLimit;
        }else {
            speedLimit = speedLimit + over;
            return speedLimit;
        }
    }
    public int points(int user){

        if(speedLimit>5){
            point = point-1;
        }
        return point;
    }
}
