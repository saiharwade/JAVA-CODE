package MultiThreading.Challenge101;

public class ThreadTesting extends Thread{

    private final int ThreadNo;

    public ThreadTesting(int ThreadNo) {
        this.ThreadNo = ThreadNo;
    }

    public void run(){
        System.out.println("The Thread has Started" + this.ThreadNo);
    }
}
