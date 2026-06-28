package ExceptionHandling;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int first = input.nextInt();
        int Sec = input.nextInt();

        //We Use try when we know that this type of exception might come.
        try{
            int[] a = new int[5];
            a[6] = first / Sec;
            int sum = first / Sec;
            System.out.println("The Sum is" + a + " ," + sum);

        }catch(ArithmeticException exception){
            System.out.printf("%s, enter valid values", exception.getMessage());
            System.out.println();
            System.out.println("Enter the Valid Number");

        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("The Array Don't have the number of index you Entered");

        }catch(NumberFormatException e) {// | AritheticException){
            //You Can give same output to both Exception
            System.out.println("Multiple Exception");

        }catch(Throwable th){//Throwable contains al types exception, if any above exception doesn't invokes then we can trigger throwable exception which contains all exception
            System.out.println("General Exception");
        }finally {
            System.out.println("This Block will always execute regarless the fact that there exception or not");
        }
    }
}

/*IMP OF FINALLY : its like yout took a book from library then no matter what happens if you became late or anything you have to return the book
* Same thing goes in code no matter what if the exception rises or not the finally will always execute.*/




//Why do we need finally?
//
//Imagine you're reading a file.
//
//FileReader reader = new FileReader("data.txt");
//
//After reading the file, you should close it.
//
//        reader.close();
//
//Now suppose an exception occurs while reading.
//
//        reader.read();
//
//Without finally:
//
//        try {
//FileReader reader = new FileReader("data.txt");
//    reader.read();
//    reader.close();
//}
//        catch(IOException e) {
//        System.out.println("Error");
//}
//
//If reader.read() throws an exception,
//
//Java jumps directly to catch.
//
//This line
//
//reader.close();
//
//is never executed.
//
//The file remains open.
//
//This is called a resource leak.
//
//Using finally
//FileReader reader = new FileReader("data.txt");
//
//try {
//        reader.read();
//}
//        catch(IOException e) {
//        System.out.println("Error");
//}
//        finally {
//        reader.close();
//}
//
//Now,
//
//whether reading succeeds or fails,
//
//the file is always closed.
//
//Think of it like borrowing a library book 📚
//
//You borrow a book.
//
//Two things can happen:
//
//Case 1
//
//Everything goes well.
//
//        You return the book.
//
//Case 2
//
//You trip and fall while reading it.
//
//Should you keep the book forever?
//
//No.
//
//You still return it.
//
//The act of returning the book is like the finally block.
//
//It happens no matter what.
//
//        Execution Flow
//Case 1: No exception
//try {
//        System.out.println("Try");
//}
//        catch(Exception e) {
//        System.out.println("Catch");
//}
//        finally {
//        System.out.println("Finally");
//}
//
//Output
//
//        Try
//Finally
//Case 2: Exception occurs
//try {
//int x = 10 / 0;
//}
//        catch(ArithmeticException e) {
//        System.out.println("Catch");
//}
//        finally {
//        System.out.println("Finally");
//}
//
//Output
//
//        Catch
//Finally
//Case 3: Exception not caught
//try {
//int[] arr = new int[5];
//    System.out.println(arr[10]);
//}
//        finally {
//        System.out.println("Finally");
//}
//
//Output
//
//        Finally
//Exception in thread "main"
//java.lang.ArrayIndexOutOfBoundsException...
//
//Notice:
//
//The exception still goes to the JVM,
//
//but finally executes first.
//
//Even if there is a return
//
//This surprises many beginners.
//
//public static int test() {
//
//    try {
//        return 10;
//    }
//    finally {
//        System.out.println("Finally");
//    }
//
//}
//
//Output
//
//        Finally
//
//Returned value
//
//10
//
//Even though return is executed,
//
//Java still executes the finally block before the method actually returns.
//
//What is finally mainly used for?
//
//Almost always for cleanup.
//
//        Examples:
//
//Close files
//reader.close();
//Close database connections
//connection.close();
//Close sockets
//socket.close();
//Release locks
//lock.unlock();
//Close Scanner
//scanner.close();
//Real-world example
//
//Imagine you're connecting to a database.
//
//Connection con = DriverManager.getConnection(...);
//
//        try {
//        // Query database
//        }
//        finally {
//        con.close();
//}
//
//If you don't close the connection:
//
//Memory is wasted.
//Database connections remain occupied.
//Eventually, your application may not be able to create new connections.
//
//        That's why cleanup code belongs in finally.
//
//Does modern Java still use finally a lot?
//
//Since Java 7, for classes like FileReader, Scanner, BufferedReader, and database resources that implement AutoCloseable, developers often use try-with-resources:
//
//        try (Scanner input = new Scanner(System.in)) {
//        System.out.println(input.nextLine());
//        }
//
//Java automatically closes the Scanner when the block ends, even if an exception occurs. This reduces the need for an explicit finally block in many situations.
//
//However, finally is still very useful for cleanup that isn't covered by try-with-resources, such as releasing locks, resetting application state, logging completion, or other actions that must always happen.
//
//Summary
//Situation	Does finally execute?
//No exception	✅ Yes
//Exception caught	✅ Yes
//Exception not caught	✅ Yes (before the exception leaves the method)
//return in try	✅ Yes
//return in catch	✅ Yes
//Main purpose	Cleanup of resources
//Rule to remember
//try → "Do the risky work."
//        catch → "Handle the problem if one occurs."
//        finally → "No matter what happened, always execute this cleanup code."
//
//This is why finally is such an important part of robust Java programs.