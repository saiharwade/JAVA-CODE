package Abstract;

public abstract class Vehicle implements Transport {
    private int noofTyres;

    public abstract void soundofvehicle(); //Abstract methods are just defined there is no body of it
    //we can only define the abstract methods when the class is abstract as well.
    //we hand over duty of defining the method body to the child which inheritated this class.
    //it is compulsary to the child to define the body of the abstract method body if it inheritates the abstract class.

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

    //public abstract void getsetgot();


//    public abstract void getsetgo();
}
