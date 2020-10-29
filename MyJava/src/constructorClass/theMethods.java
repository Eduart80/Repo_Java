package constructorClass;

public class theMethods {

    private String  name = "";
    private String accType = "";
    private String ssn = "";
    protected int accountNmbr = 100;
    protected static int bankAccounts = 100;

    public theMethods(String userName,String accType, String sSN){
        this.name = userName;
        this.accType = accType;
        this.ssn = sSN;
        this.accountNmbr = ++bankAccounts;

    }
    public void miniInfo(){
        System.out.println("Name: "+name+
                "\nAccount Type: "+accType+
                "\nSSN: "+ssn+
                "\nAccount Number: "+accountNmbr);
    }
    public void bankNumb(){

    }

}
