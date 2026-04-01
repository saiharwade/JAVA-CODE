import java.util.Scanner;

public class Task10_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number You Want to Check: ");
        int num = input.nextInt();

        if (isArmstrong(num)) {
            System.out.println("The Number is Armstrong");
        } else {
            System.out.println("The Number is Not Armstrong");
        }
    }

    public static boolean isArmstrong(int n) {
        int original = n; // This variable is to compare the calculated value.
        int sum = 0; //Store the calculated value to compare it with original value.
        int count = 0; // count the number of values.
        int temp = n; // reduce the value for calculation.

        // Step 1: Count number of digits
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        temp = n;

        // Step 2: Calculate sum of digits raised to power of count
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;

            // Calculate digit^count using loop
            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        return sum == original;
    }
}