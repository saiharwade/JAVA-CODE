package Abstract;

public class TestofAbstraction {

    public static void main(String[]args){

        //Vehicle n1 = new Vehicle(4); this can't be initialize cause the class is abstract s
        //so we can only use it using car class object.
        Car c1 = new Car();
        c1.commute(); //here the commute is vehicle class method and we can only access it using car object.

    }
}