package Challenge86;

public class Car extends Vehicle{

    @Override
    public void service(){
        super.service();
        System.out.println("The Car has Started");
    }

    public static void main(String[]args){
        Car c = new Car();
        Vehicle v = new Vehicle();
        c.service();
        v.service();
    }
}
