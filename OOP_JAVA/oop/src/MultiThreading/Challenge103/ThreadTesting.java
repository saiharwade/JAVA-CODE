package MultiThreading.Challenge103;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTesting {
    public static void main(String[]args){

        try(ExecutorService n =  Executors.newSingleThreadExecutor()){
            PrintTask m = new PrintTask();
            n.submit(m);
            //For Autoclosable we have to use the ExecutorService interface,So that the try block can automatically shutdown the Thread,
        }
    }
}
