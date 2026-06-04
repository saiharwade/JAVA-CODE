package Inheritance;//Object Class is the parent Class of All Classes in JAVA. IF Programmer didn't defined any parent class after the class then JAVA Automatically infuse Object Class in every class.
//Object Class Contains various Methods Like:
//1 getclass()
//2 hashcode()
//3 wait()
//4 tostring()
//5 clone()
//6 equals()
//7 finalize()
//8 notify()
//9 notifyall()

//The Method of OverRide is also there. Ex. tostring the tostring is parent method and it is automatically called when the object is sout
// ,but we can override it by redefining its behaviour or which output it should show.

//so there is method called toString(). which is often override by the us. so why it is called override and not overwrite cause the overriding means re defining the method by the child class.
//the toString method gets called default and returns the class name and its hashcode whereas when we override it we re define what that method can be written.
// the concept of override itself tells to temporarily change the meaning of the method while keeping the original metho as it is in the parent class.
//whereas overwriting means completely change the data permanently. like how we overwrite the file name so it is changed permanently.



public class ObjectClass {
    public static void main(){
        Vehicle v1 = new Vehicle();
        System.out.println(v1.toString());
        System.out.println(v1.hashCode());

    }
}
