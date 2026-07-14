package MultiThreading.ExcutorServices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultipleExecutors {

    public static void main(String[]args) throws InterruptedException {

        PrintTask t1 = new PrintTask('*');
        ExecutorService exce = Executors.newFixedThreadPool(3); //This Method Created the Object of the Executors class and also Creats and give us the desired number of Threads which we have entered.


        exce.submit(t1);
        exce.submit(t1);
        exce.submit(t1);


        //This awaitTermination check if the given task to the thread has been completed or not annd return true or false accordingly
        //IF it does not return true after waiting for 10 sec also the wee have written logic that the all the task will get shutdown immediately no matter what
        //Otherwise what will happen we know the main method is fast cause the main method which also is Thread. That main thread don't have to do the task so it will end the execution very quickly 

        if(!exce.awaitTermination(10, TimeUnit.SECONDS)){
            System.out.println("\n*******2");
            exce.shutdownNow();
        }

    }
}
