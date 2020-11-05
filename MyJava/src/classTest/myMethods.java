package classTest;

public class myMethods {
// new after test
    public void findDelete(int[] arrays, int user){
        int result = 0;
        for(int i=0; i<arrays.length;i++){
            if(user==arrays[i]){
                continue;
            }else {
                result = arrays[i];
                System.out.println(arrays[i]);
            }
        }
    }
// In test
    public int findDelete1(int[] array, int user) {
        int missing = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if(user == array[i]) {
                missing = array[i];
                System.out.println("found " + missing);
            }
        }
        return missing;
    }
    ////////////////////////////////////////////////////
// during test
    public  int findMissing1(int[] arr){
        int missing = 0;

        for(int i=0; i<arr.length ; i++) {
            missing= arr[i]+1;
        }
        System.out.println("lesh "+missing);
        return missing;
    }

// after test
     public  int findMissing(int[] arr){
        int n = arr.length+1;
        int sum = (n * (n+1))/2;
         for (int j : arr) {
             sum = sum - j;
         }
        return sum;
     }

////////////////////////////////////////////////////
// in test
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
