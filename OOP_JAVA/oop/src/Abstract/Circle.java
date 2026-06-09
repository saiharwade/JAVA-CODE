package Abstract;
import java.util.Scanner;

public class Circle extends Shape83{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateAreaofCircle(){
        return 2* Math.PI * this.radius;
    };

//    @Override
//    public double calculateArea() {
//        return 0;
//    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        Circle c1 = new Circle(5.5);
        System.out.print(c1.calculateAreaofCircle());

    }
}
