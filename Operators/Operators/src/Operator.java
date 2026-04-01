public class Operator{
    public static void main() {
        int a = 1;
        int b = 2;

        int c = a;
        a = b; // a & b variable are already created so don't have to write again int a & b.
        b = c;

        System.out.println(a);
        System.out.println(b);

    }
}
