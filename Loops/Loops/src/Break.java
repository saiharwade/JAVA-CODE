public class Break {
    public static void main(String[] args) {
        System.out.print("Before loop ");
        for(int i = 1; i < 1000; i++){
            if(i == 101){
                break; //this will stop the loop fully
            }
            else if(i == 10){
                continue; // this will skip that one iteration and go back to the starting of the loop.
            }
            System.out.print(i + " ");
        }
        System.out.println("Out of the Loop");
    }
}
