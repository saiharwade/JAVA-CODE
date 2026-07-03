package WrapperClass;
/*So Just Like the Non Premitive class we can create a object of primitive data types as well
* so for int we Integer class like for every primitive data type we have a class*/
public class WrapperClass {

    public static void main(String[]args){

        int num = 7;

        //Integer num1 = num; autoboxing
        Integer num1 = new Integer(8);  //boxing this is called

        //int num2 = num.intvalue();
        int num2 = num1; //auto unboxing

        System.out.println(num2);
    }
}
