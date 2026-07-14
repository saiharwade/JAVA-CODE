/*Write a Method concatenate Strings that takes variable arguments of String type and concatenate them into single string*/


package CollectionFrameworksjava;



public class Challenge89 {

    public static void main(String[]args){
        System.out.println(Concatenate("Prashant"));
        System.out.println(Concatenate("Sai"));
        System.out.println(Concatenate("Lavkesh"));
    }

    public static String Concatenate(String... a){

        StringBuilder sb = new StringBuilder();
        for (String str : a){
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
