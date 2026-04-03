
import java.util.Scanner;

public class Febonacci{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int pos = input.nextInt();
        for(int i = 1;i <= pos;i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    public static int fibo(int pos){
        if (pos == 1){
            return 0;
        }
        if(pos == 2){
            return 1;
        }
        return fibo(pos - 1) + fibo(pos - 2);
    }
}