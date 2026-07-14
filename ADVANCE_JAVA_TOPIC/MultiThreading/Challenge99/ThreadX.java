package MultiThreading.Challenge99;

public class ThreadX extends Thread{
    private final int tNo;

    public ThreadX(int tNo) {
        this.tNo = tNo;
    }

    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Hello From Thread" + tNo);
        }
    }
}
