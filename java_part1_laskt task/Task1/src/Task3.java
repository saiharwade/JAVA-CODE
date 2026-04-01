//Write a function that calculates the factorial of a given number.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a Number you want a Factorial of: ");

        int n = input.nextInt();

        int i = n;
        int factor = 1;

        while (i > 1){
            if (i == 0 || i == 1){
                System.out.println("The Factorial is 1");
            }
            else {
                factor *= i;
            }
            i--;
        }

        System.out.println(factor);
    }
}
