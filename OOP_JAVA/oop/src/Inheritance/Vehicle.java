package Inheritance;

public class Vehicle {
    private int numberOfTires;

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public void commute(){
        System.out.printf("I am Going From Place A to Place B");
    }
}
