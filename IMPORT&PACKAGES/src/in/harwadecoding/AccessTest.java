package in.harwadecoding;

public class AccessTest {

    public static void main(String[]args){
        Car car = new Car("Black", "BMW", 1, 5000);
        car.color = "Red";
        car.model = "swift";
        System.out.println(car);

        Car newCar = new Car("Blue", "Porche", 2, 50000);
        System.out.print(newCar);
    }
}
