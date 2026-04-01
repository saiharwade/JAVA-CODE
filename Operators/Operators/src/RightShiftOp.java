import java.util.Scanner;

public class RightShiftOp {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of Not/Compliment Operator");
        System.out.println("Please Enter Your Number: ");
        int num = input.nextInt();

        int result = num << 2;
        System.out.println("Your Result is: " + result);
    }
}
//In Right shift the Work is of / by 2 instead of Multiplying.
