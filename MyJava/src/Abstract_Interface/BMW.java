package Abstract_Interface;

public class BMW extends Car implements Regullat{
    @Override
    public void serial() {
        System.out.println("Implement from CAR Abstract class");
    }
    public void veni(){
        System.out.println("mother bord veni");
    }

    @Override
    public void regulli1() {
        System.out.println("regulli 1");
    }

    @Override
    public void regulli2() {
        System.out.println("regulli 2");
    }

    @Override
    public void regull3() {
        System.out.println("regulli 3");
    }
}
