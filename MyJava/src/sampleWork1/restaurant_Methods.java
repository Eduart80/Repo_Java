package sampleWork1;

public class restaurant_Methods {

    public String restName = "";
    public int guestCapacity = 0;
    public int guestCount = 1;

    public restaurant_Methods(String name, int guests){
        this.restName = name;
        this.guestCapacity = guests;
    }

    public void info(){
        System.out.println("Guest capacity remain "+guestCapacity);
        System.out.println("People in the restaurant "+guestCount);
    }
    //Create a method that tells user if the seats are available
    public int guestCap(int gIn){
        int data = guestCapacity - gIn;
        guestCapacity=data;
        return data;
    }
    public int geCount(int gCou){
        int data = guestCount+gCou;
        guestCount=data;
        return data;
    }
    public void gLeave(int leave){
        this.guestCapacity = guestCapacity+leave;
        this.guestCount = guestCount - leave;
    }
    public void summery(){
        System.out.println("Restaurant name "+restName);
        System.out.println("Guest present "+guestCount);
        System.out.println("Capacity "+guestCapacity);
    }


}
