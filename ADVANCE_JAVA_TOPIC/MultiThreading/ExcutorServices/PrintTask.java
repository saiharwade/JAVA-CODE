package MultiThreading.ExcutorServices;

public class PrintTask implements Runnable{

    private final char TargetChar;

    public PrintTask(char targetChar) {
        this.TargetChar = targetChar;
    }

    @Override
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.printf("%d %c",i, TargetChar);
        }

        System.out.println(Thread.currentThread().getName());
    }
}
