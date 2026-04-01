import java.util.Scanner;

public class BitwiseOpe {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise and operator\n");

        System.out.print("Please enter the first Number: ");
        int first = input.nextInt();

        System.out.print("Now, enter the other number:");
        int second = input.nextInt();



        int result = first & second;
        int result2 = first | second;

        System.out.println("The And Result is : " + result);
        System.out.println("The Or Result is : " + result2);
    }
}
