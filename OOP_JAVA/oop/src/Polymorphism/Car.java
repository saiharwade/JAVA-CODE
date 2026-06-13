package Polymorphism;

public class Car implements Vehicle{


    public int noofTyres(){
        return 4;
    }

    @Override
    public void start() {
        System.out.print("The Car has Started");
    }
}
