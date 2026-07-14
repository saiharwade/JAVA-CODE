package MultiThreading.Synchrozation;

public class Counter {

    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }

    //IMP NOTE OF SYNCHRONIZATION = if same object1 is run in thread1 and Thread2 then the synchronize will work cause two thread are accessing the same method with same object.
    //IT won't work when two different object are access the same method.
}
