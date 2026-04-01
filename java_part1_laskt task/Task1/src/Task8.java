import java.util.Scanner;

public class Task8 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number you Want to Reverse: ");
        int n = input.nextInt();
        int b = Reverse(n);
        System.out.print(b);

    }
    public static int Reverse(int n){
        int rev = 0;

        while(n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }
}
