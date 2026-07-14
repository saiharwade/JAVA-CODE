package MultiThreading.Synchrozation;

public class TestSynchronization {
    public static void main(String[]args) throws InterruptedException {
        Counter count = new Counter();
        ThreadSync t1 = new ThreadSync(count);
        ThreadSync t2 = new ThreadSync(count);

        t1.start();
        //t1.join();
        t2.start();
        //Thread.sleep(10000); This Sleep method stops the execution of the method for given time in the input

       //t1.join(); //join is important cause the main method run fast so till the time it increments t1 and t2 the main will print the last line and it willl show us 0. cause till the time increment start main method have already been finished.
        //t2.join();
        System.out.println(count.getCount());
    }
}
