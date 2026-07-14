package Enums;

class Test {
    public static void main(String[]args){
        TrafficLight status = TrafficLight.RED;

        TrafficLight[] sta = TrafficLight.values(); //This will give all values/Object of TrafficLight

        for(TrafficLight t : sta){
            System.out.println(t);
        }
    }
}
