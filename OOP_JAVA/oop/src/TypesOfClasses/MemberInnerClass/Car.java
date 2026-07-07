package TypesOfClasses.MemberInnerClass;

public class Car {

    public String ModelName;

    public boolean isEngineOn;

    public Car(String ModelName, boolean isEngineOn){
        this.ModelName = ModelName;
        this.isEngineOn = isEngineOn;
    }

    class Engine{

        void start(){
            if(!isEngineOn){ //Since there are variable of engineon of engine class so we can't write this cause there will be no oject as well of the engine object
                //Although we can create the object of the engine class
                isEngineOn = true;
                System.out.println("The Engine has been Started");
            }else{
                System.out.println("The Engine is already been Started");
            }
        }

    }

    public static void main(String[]arg){
        Car car1 = new Car("Safari", true);

        Car.Engine eng = car1.new Engine(); //So Like this in order to create the class of the inner class of the Car Class we have to create the Car object first and then with the help of the car object we can create the object of the Engine Class.
    }
}
