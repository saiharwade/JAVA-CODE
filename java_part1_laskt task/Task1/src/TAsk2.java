//Create a program to sum all odd numbers from 1 to a specified number n.

import java.util.Scanner;

public class TAsk2 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= n){
            if (i%2 != 0){
                sum += i;
            }
            i++;
        }

        System.out.println(sum);
    }
}
