package Abstract;

public abstract class Vehicle {
    private int noofTyres;

    public Vehicle(int noofTyres){
        this.noofTyres = noofTyres;
    }

    public int getnoofTyres(){
        return this.noofTyres;
    }

    public void setnoofTyres(int Tyres){
        this.noofTyres = Tyres;
    }

    public void commute(){
        System.out.println("Going....");
    }

}
