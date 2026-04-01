import java.util.Scanner;

public class Task7{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = input.nextInt();
        String Num = Prime(n);
        System.out.println(Num);
        System.out.print(Prime(n));
    }
    public static String Prime(int n){
        int i = 2;
        while(i < n ){
            if (n % i == 0){
                return "The Number is Not Prime";
            }
            i++;
        }
        return "The Number is Prime";
    }
}
