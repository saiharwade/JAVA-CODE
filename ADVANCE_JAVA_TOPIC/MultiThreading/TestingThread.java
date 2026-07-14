package MultiThreading;

public class TestingThread {
    public static void main(String[]args){
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        t1.start();
        t2.start();
        t3.start();
    }
}
