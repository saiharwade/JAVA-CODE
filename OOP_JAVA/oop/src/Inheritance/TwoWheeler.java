package Inheritance;

public class TwoWheeler extends Vehicle{
    TwoWheeler(){
        setNumberOfTires(2);

    }

    public void Balance(){
        System.out.println("I am Balancing on Two Tires");
    }
}
