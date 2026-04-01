//Create a Program to find the least common Multiple(LCM) of two numbers.
// The Smallest Number which  is Divisible by both the entered numbers.

import java.util.Scanner;

public class Task5 {
    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int n = input.nextInt();
        System.out.print("Enter the Second Number: ");
        int n2 = input.nextInt();

        int Lcm = Lcm(n, n2);
        System.out.println("The LCM of Both NUmbers are: " + Lcm);
    }

    public static int Lcm(int n1, int n2){
        int i = 1;
        while (true){
            int factor = n1 * i;
            if(factor % n2 == 0){
                return factor;
            }
            i++;
        }

    }
}
