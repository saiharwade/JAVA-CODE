package ExceptionHandling;
import java.util.Scanner;


public class Challenge87 {
    public static void main(String[]args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2 = input.nextInt();
        try {
            int Sum = num1 / num2;
            System.out.println("The Division is " + Sum);
        }
        catch (ArithmeticException e){
            if(e.getMessage().equals("/ by zero")){
                System.out.println("Divide By Zero Occured."); //here we are only handling the zero exception
            }else{
                throw e; //here e is already an created object we throw this cause we are only handling the zero exception not other arithmetic Exception.
            }
            //Another Imp thing is that we throw new object when we write specific condition like age > 18. if someone enters less num than 18 then we throw new exception objectf
        }finally{
            System.out.println("Run the Code Again to do the Division Again");
        }
    }
}
