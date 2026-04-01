//Create a program to find the greatest common divisor(GCD) of two numbers.
//when both numbers are divided and 0 is come then it is called GCD.
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first Nuumber: ");
        int n1 = input.nextInt();

        System.out.print("Enter the Second Number: ");
        int n2= input.nextInt();

        int GCD = Gcd(n1,n2);
        System.out.println("The Greatest Common Divisor of Both Numbers are: " + GCD);

    }
    public static int Gcd(int n1, int n2){
        int gcd = 1;
        int i = 2;
        int least = least(n1, n2);
        while(i < least){
            if(n1 % i == 0  && n2 % i == 0){
                return  i;
            }
            i++;
        }
        return 1;
    }


    public static int least(int n1, int n2){
        if(n1 > n2){
            return n1;
        }
        else{
            return n2;
        }
    }
}
