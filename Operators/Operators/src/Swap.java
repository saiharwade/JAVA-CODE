import java.util.Scanner;

public class Swap {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Swaping");
        System.out.print("Enter Your first Number:");
        int a = input.nextInt();
        System.out.print("Enter Your Second Number:");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("The Numbers are Swap and the value of a = "+ a + " and the value of b = " + b);
    }
}
