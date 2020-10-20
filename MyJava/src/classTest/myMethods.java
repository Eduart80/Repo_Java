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
             missing= arr[i]+1;
        }
         System.out.println("lesh "+missing);
        return missing;
     }


    public int speedLimit = 70;
    public int speed ;
    public int point = 12;

    public void speed(int user){
        speed = user;
        System.out.println("Speed limit 70, your speed is "+speed);
    }

    public void points(int numb){
        int res = 0;
        if ( speed > speedLimit)
        {
            res = (speed-speedLimit)/5;
            point= point-res;
        }if(point<0){
            System.out.println("You have no more points in your licence.");
        }
        System.out.println("you have "+point+" points.");
    }
    
}
