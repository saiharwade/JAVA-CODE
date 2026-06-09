package Abstract;

//so the car is not a abstract class, so if it extends the abstract class it has to write all the methods of the abstract class.
public class Car extends Vehicle{
    public Car(){
        super(4);
    } //IMP: as there is no default/ no arg constructor in the vehicle class the car class need to give the parameter in its own class
    // explicitly.

    //As the abstract class which we inheritate has abstract method which don't have any method body it just define.
    //So the child class has the responsibility to define the body of the class abstract method

    public void soundofvehicle(){
        System.out.print("Vroom..Vroom..");
    }

    @Override
    public void getsetgo(){
        System.out.print("Went to the destination");
    }
    //if the getsetgo was not override or the body is not written in the vehicle then it is fine although it can write the body.
    //but if it don't want to write the body in the vehicle then he can do that but it has to be define in the first non abstract class.

}
