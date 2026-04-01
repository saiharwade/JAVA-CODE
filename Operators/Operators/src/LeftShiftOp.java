import java.util.Scanner;

public class LeftShiftOp {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of Not/Compliment Operator");
        System.out.println("Please Enter Your Number: ");
        int num = input.nextInt();

        int result = num >> 1; //This means the number will get * by 2 one Time.
        System.out.println("Your Result is: " + result);
    }
}
// num >> (The number of time it will get * multiply by 2)
