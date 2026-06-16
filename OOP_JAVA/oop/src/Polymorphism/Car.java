package Polymorphism;

public class Car implements Vehicle{


    public int noofTyres(){
        return 4;
    }

    //IMP note : If the Parent class don't have default constructor then it is child class responsibility to initialize the parameters of the parent class in the
    @Override
    public void start() {
        System.out.print("The Car has Started");
    }
}
