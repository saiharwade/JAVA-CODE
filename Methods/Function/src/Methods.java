public class Methods {
    static void main() {
        greeting();
        printFirstPattern();
        printSecondPattern();
    }
    public static void greeting(){
        System.out.println("Welcome to KG Coding");
    }

    public static void printFirstPattern(){
        int rows = 5;
        while(rows > 0){
            System.out.print("*");
            int i = 1;
            while(i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println(" ");
            rows--;
        }
    }
    public static void printSecondPattern(){
        int rows = 5;
        while(rows > 0){
            int i = 1;
            while(i <= rows){
                System.out.print("* ");
                i++;
            }
            System.out.println(" ");
            rows--;
        }

    }
}
