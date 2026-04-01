import java.util.Scanner;

public class Task12 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int rows = input.nextInt();
        //System.out.println(leftPattern(rows)); it is return void so it will not return anything
        //so we write jus the method

        leftPattern(rows);
        rightPattern(rows);
    }

    public static void leftPattern(int rows){
        int i = 1;

        while(i <= rows){
            int f = 1;

            while(f <= i){
                System.out.print("* ");
                f++;
            }
            System.out.println(); //move to next line
            i++;
        }
    }

    public static void rightPattern(int num){
        int i = 1;

        while(i <= num){

            int f = num - 1;
            while(f >= i){
                System.out.print("  ");
                f--;
            }

            int k = 1;
            while(k <= i){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
