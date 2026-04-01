import java.sql.SQLOutput;
import java.util.Scanner;

public class Return {
    static void main(String[] args)  { // string[] args is a array which takes multiple inputs.
        int firstNo = readNumber() + 1;
        int secNo = readNumber() + 2;

        int sum = firstNo + secNo;
        System.out.println(sum);

    }
    public static int readNumber(){ //Here we didn't void cause here we have to return some value
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number:");
        int a = input.nextInt();// it is a function which read the input and returns it
        return a;
    }
}
