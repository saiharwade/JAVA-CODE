// Check whether the Input Number is Armstrong or not.
import java.util.Scanner;
public class Task10 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number You Want to Check: ");
        int num = input.nextInt();
        int Arm = armStrong(num);
        System.out.println(Arm);
        if(Arm == num){
            System.out.print("The Number is Armstrong");
        }
        else{
            System.out.print("The Number is Not Armstrong");
        }

    }

    public static int armStrong(int n){
        int num = n;
        int sq = 1;
        int sum = 0;
        int count = count(n);
        while(num > 0){
            int digit = num % 10;
            int power = 1;
            int i = 1;
            while(i <= count){
                power = power * digit;
                i++;
            }
            sum = sum + power;
            num /= 10;
        }
        return sum;
    }
    public static int count(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n / 10;
        }
        return count;
    }
}
