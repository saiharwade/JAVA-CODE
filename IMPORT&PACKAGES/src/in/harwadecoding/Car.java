package in.harwadecoding;

public class Car {
    public String color;

    public String model;

    private double fuelLevel;

    private long costofPurchase;

    public Car(String model, String color, double fuelLevel, long costofPurchase) {
        this.model = model;
        this.color = color;
        this.fuelLevel = fuelLevel;
        this.costofPurchase = costofPurchase;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", costofPurchase=" + costofPurchase +
                '}';
    }

    public double getfuellevel(){
        return this.fuelLevel;
    }

    public void setfuelLevel(double fuellevel){
        this.fuelLevel = fuellevel;
    }
}
