
import java.util.Scanner;

public class Task3__ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = input.nextInt();
        int factor = fact(n);
        System.out.println("The Factorial of "+ n + " is = " + factor);
    }

    public static int fact(int n){
        int i = n;
        int factor = 1;
        while(i >= 2){
            factor = factor * i;
            i--;
        }
        return factor;
    }
}
