package MultiThreading;

public class SecondTask extends Thread {
    public void run(){
        for(int i = 0; i <= 100; i++){
            System.out.print(i +"#");
        }
        System.out.println("THe Second Task Completed");
    }
}
