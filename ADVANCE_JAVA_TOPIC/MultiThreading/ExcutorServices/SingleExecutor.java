package MultiThreading.ExcutorServices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleExecutor {
    public static void main(String[]args){
        PrintTask t1 = new PrintTask('*');
        ExecutorService exce = Executors.newSingleThreadExecutor(); //This is the Way to Create a new object of the Executors class.
        //we can't Create the object of the executors class like we normally do cause all the methods of the executors are static.
        //And remember Executors is a class and Executor is an interface.
        //The Method newSingleThreadExecutor() create a singleThread we Can create a Multiple Threads using mehtod newFixedThreadPool();


        //Some Knowledge of Executor : executor helps us to by giving multiple threads instead of creating Thread Manually.
        //Whats the Structure of them is we give them task one by one those task gets add into queue and the FIFO will get Executed by assigning it to the threads.
        exce.submit(t1);
    }
}
