package Interfaces;

public interface Animal {


    void sleep();

    static void info(){
        System.out.println("The Animal is Eating");
    } //This static method can be access using the object as well as directly using the interface

    public default void run(){
        this.sleep(); //This is call the method of the object which called this method
        System.out.println("Hello"); //This can be accessed using the object of the class which implements this interface
    }
}
