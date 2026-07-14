package MultiThreading.Challenge102;

public enum TrafficLights {
    RED(3000),
    YELLOW(2000),
    GREEN(1000);

    private final long inTimeMillis;

    TrafficLights(long inTimeMillis){
        this.inTimeMillis = inTimeMillis;
    }


    public long getTimeOfColor(){
        return this.inTimeMillis;
    }
}
