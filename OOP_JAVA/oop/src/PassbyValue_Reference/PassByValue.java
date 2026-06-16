package PassbyValue_Reference;

public class PassByValue {
    public static void main(String[]args){
        int x = 5;
        int y = 10;
        int sum = add(x,y);
        System.out.printf("x=%d, y=%d, sum=%d", x, y, sum);
    }

    public static int add(int a, int b){
        a += b;
        return a;
    }
    //This thing teaches us Pass by value
    //In the method even though we change the value of the a and added the a value.
    //It didn't affect the original x value cause the while sending the value in the method it is sending the copy of the variable
    //As it is sending the copy it is not sending the original value so it din't affect the original value of the variable
    //This is called Pass by Value.
}
