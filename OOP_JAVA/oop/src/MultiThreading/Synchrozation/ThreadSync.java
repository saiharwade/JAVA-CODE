package MultiThreading.Synchrozation;

public class ThreadSync extends Thread {

    public Counter counter;

    //Then we will Create a constructor to take a Counter object.
    public ThreadSync(Counter counter){
        this.counter = counter;
    }

    public void run(){
        for(int i = 0; i <= 1000; i++){
            counter.increment();
        }
    }
}
