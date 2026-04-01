import java.util.Scanner;

public class Ternary_op {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Checker: ");
        System.out.print("Please Enter Your First Number: ");
        int num1 = input.nextInt();
        System.out.print("Please Enter Your Second Number: ");
        int num2 = input.nextInt();

        int greaterNumber = num1 > num2 ? num1 : num2;
        System.out.println(greaterNumber + " is the greatest Number");
    }
}
