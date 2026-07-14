package MultiThreading.Challenge99;

public class Challenge99 {

    public static void main(String[]args) throws InterruptedException {
        ThreadX t1 = new ThreadX(1);
        ThreadX t2 = new ThreadX(2);

        t1.start();
        Thread.sleep(5000);
        t2.start();
    }
}
