package Polymorphism;

public class Reference_objects {

    public static void main(String[] args) {
        //Normal
        Car c = new Car();

        //Upcasting
        Vehicle v1 = new Car();

        //Upcasting
        Vehicle vCar = new Car();

        //DownCasting but not recommended
        Car cVehicle = (Car) new Vehicle();

        Object ref = new Car();

    /* This is Upcasting and Downcasting
    In this We Use the Parent Class as the reference of the Child Class.
    It is Same like We can store int in the float or Double
    cause the big can store smaller one whereas smaller can not store bigger one.
    but if we want to then we have to do the explicit casting.
    */

    }
    public static void castTest(Vehicle veh){
        Car cVehicle = (Car) veh;
        cVehicle.start(); //This is explicit casting, we do this when we know that the object pass in this mehtod is car object even though they ask for vehicle object.

        //veh.noofTyres();//This won't be Possible cause we know that its an Car method so Car can have vehicle Method but Vehicle Object can't use Car Mehtod.
        //We can do this Instead

        ((Car) veh).noofTyres(); //we say here that veh is Car object so you can access the Car Methods

        cVehicle.noofTyres();
    }
}