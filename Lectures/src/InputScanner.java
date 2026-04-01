import com.sun.security.jgss.GSSUtil;

import java.util.Scanner; // in Build Scanner class is imported

public class InputScanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // new object is initialize as input
        // now input object can use the methods in class Scanner

        //String name = input.nextLine();


        System.out.println("Welcome to our calculator");
        System.out.print("Please Enter First Number:");
        int firstNum = input.nextInt();
        System.out.print("Please Enter Second Number:");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("The Sum of two numbers is: " + sum);
    }
}
