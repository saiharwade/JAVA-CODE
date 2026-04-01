import java.util.Scanner;

public class BitwiseCompTask {
    static void main() {
        //compliment == not(~)
        //not converts 1 to 0 and  0 to 1
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of Not/Compliment Operator");
        System.out.println("Please Enter Your Number: ");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("Your Result is: " + result);
    }
}
//The Result going to be different cause a integer contains 4 byte and 1 byte = 8bit so
//So internally it is going to be ex 00001111 not 1111 so int = 4 byte = 32 bits