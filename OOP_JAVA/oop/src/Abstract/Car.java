package Abstract;

public class Car extends Vehicle{
    public Car(){
        super(4);
    } //IMP: as there is no default/ no arg constructor in the vehicle class the car class need to give the parameter in its own class
    // explicitly.
}
