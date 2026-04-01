//Create a Program that computes the sum of the digits of an integer.

import java.util.Scanner;

public class Task4 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Number: ");
        int n = input.nextInt();
        int sum = sum(n);
        System.out.println(sum);
    }

    public static int sum(int n){
        int sum = 0;
        while(n > 0){
            sum = sum + (n % 10);
            n /= 10;
        }

        return sum;
    }
}
