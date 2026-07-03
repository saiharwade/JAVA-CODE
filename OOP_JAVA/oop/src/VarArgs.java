//Varargs are basically use for taking n number of arguments
//cause we use overloading for different number of argument we write different number of method.

public class VarArgs {
    public static int sum(int first, int sec, int... a){// we can also define atleast how many arguments a user shoul compulsary pass
        int i = 0;
        int sum = 0;

        while(i < a.length){
            sum += a[i];
            i++;
        }

        return sum;
    }

    public static void main(String[]args){
        System.out.print(sum(8,2,6,9));
    }
}
