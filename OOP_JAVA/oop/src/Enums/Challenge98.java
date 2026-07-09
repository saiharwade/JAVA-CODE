package Enums;

public class Challenge98 {
    public static void main(String[]args){
        Days[] d = Days.values();

        for(Days s : d){
            System.out.printf("%s : %s\n", s , s.getType());
        }
    }
}
