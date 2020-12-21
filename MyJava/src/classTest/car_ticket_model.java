package classTest;

public class car_ticket_model {
    public static void main(String[] args) {
        int userspeed = 130;
        speed(userspeed);
        points(userspeed);
    }
        public static int speedLimit = 70;
        public static int speed ;
        public static int point = 12;

        public static void speed(int user){
            speed = user;
            System.out.println("Speed limit 70, your speed is "+speed);
        }

        public static void points(int numb){
            int res = 0;
            if ( speed > speedLimit)
            {
                res = (speed-speedLimit)/5;
                point= point-res;
                    if(point<=0){
                        System.out.println("You have no more points in your licence.");
            }}
            System.out.println("you have "+point+" points.");
        }


}
