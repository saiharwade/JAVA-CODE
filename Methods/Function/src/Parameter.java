public class Parameter {
    static void main() {
        System.out.println(sumTwoNo(4,5));// when we pass any value then it is called arguments
        System.out.println(sumTwoNo(45,32));
        System.out.println(sumTwoNo(-76,76));
    }
    
    public static int sumTwoNo(int a, int b){ // while here we call it as parameters

        System.out.println("The First Number is: " + a);
        System.out.println("The Second Number is: "+ b);

        int sum = a + b;
        return sum;
    }
}
