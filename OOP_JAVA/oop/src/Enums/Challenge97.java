package Enums;

public class Challenge97 {
    public static void main(String[]args){
        Days[] s = Days.values(); //it gives an array of all the enum constant/object

        for(Days d : s){
            System.out.println(d);
        }
    }
}
