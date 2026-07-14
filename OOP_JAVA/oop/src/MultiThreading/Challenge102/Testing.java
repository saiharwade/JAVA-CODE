package MultiThreading.Challenge102;

public class Testing {
    public static void main(String[]args) throws InterruptedException {
        ThreadTraLight red = new ThreadTraLight(TrafficLights.RED);
        ThreadTraLight yellow = new ThreadTraLight(TrafficLights.YELLOW);
        ThreadTraLight  green = new ThreadTraLight(TrafficLights.GREEN); //We have to write the class.nameofenumconstant cause those are static;

        red.start();
        red.join();
        yellow.start();
        yellow.join();
        green.start();
        green.join();
    }
}
