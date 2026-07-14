package MultiThreading.Challenge102;

public class ThreadTraLight extends Thread {

    private final TrafficLights color;

    public ThreadTraLight(TrafficLights color) {
        this.color = color;
    }

    public synchronized void run(){
        System.out.printf("The %s has been Started", this.color);
        System.out.println();
        try {
            Thread.sleep(color.getTimeOfColor());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }if(this.color == TrafficLights.GREEN){
            System.out.println();
        }else{
            System.out.println("The Color has been Changed");
        }
    }
}
