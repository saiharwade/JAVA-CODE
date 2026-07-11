package MultiThreading.Challenge101;

public class Thread1 {
    public static void main(String[]args) throws InterruptedException {
        ThreadTesting t1 =  new ThreadTesting(1);
        ThreadTesting t2 = new ThreadTesting(2);
        ThreadTesting t3 = new ThreadTesting(3);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

    }
}
