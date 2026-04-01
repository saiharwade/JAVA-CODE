
import java.util.Scanner;

public class IFelseTask1 {
    static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check whether a Number is POS, Neg Or Zero");
        System.out.print("Enter Your Number You want to check: ");
        int a = input.nextInt();
        if(a == 0 ){
            System.out.println("The Number is Zero");
        }
        else if(a > 0){
            System.out.println("The Number is Positive");
        }
        else{
            System.out.println("The Number is Negative");
        }
    }
}
