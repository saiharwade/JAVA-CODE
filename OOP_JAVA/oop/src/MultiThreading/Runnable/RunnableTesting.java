package MultiThreading.Runnable;

public class RunnableTesting {
    public static void main(String[]args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        PrintTask p1 = new PrintTask('*'); //We use runnable interface when the class is already extending another class and can't extend Thread class(cause java don't support multi level inheritance) and work can be done using the runnable interface.
        PrintTask p2 = new PrintTask('#');
        PrintTask p3 = new PrintTask('$');

        Thread t1 = new Thread(p1);//Although we created the p1 object the class it implements the runnable interface no class to extend its method
        t1.setPriority(Thread.MIN_PRIORITY);//THIS TELL THE SYSTEM WHICH TASK SHOULD BE GIVEN MORE PRIORITY
        t1.start(); //So we have to pass the p1 object to the t1 object which makes the p1 object run.
        t1.join();// This join method stops the current thread and excutes the t1 thread first cause t1 used the method. means here main thread is running so main will stop executing and t1 thread will be executed.

        Thread t2 = new Thread(p2);
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();

        Thread t3 = new Thread(p3);
        t3.setPriority(5); // you also give the number between, 1 to 10.
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total time taken: %d",
                Thread.currentThread().getName(),
                (endTime - startTime));

        //IMP NOTE : Even though we set the priority of the task, still it doesn't assure you that the max priority task will be executed first.
    }
}
