package Polymorphism;

public class Overloading {

    String a;
    String b;

    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public String add(String a, String b){
        return a + b;
    }

    //this is called method overloading where the method name is same but the no of arguments and type of argument is different.
    //keep in mind the mehtod overloading mainly depends on the argument which are set in the method.

    //Ex of Constructor overloading

    Overloading(){
        System.out.print("This is an default Constructor");
    }

    Overloading(String a, String b){
        this.a = a;
        this.b = b;
    }
    //This is called constructor overloading
}
