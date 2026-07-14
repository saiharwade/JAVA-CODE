package ExceptionHandling;

class NavinException extends Exception{
    public NavinException(String string){

    }
}

public class CustomExceptio {
    public static void main(String[]args){
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j==0)
                throw new NavinException("I don't want to handle");
        }
        catch(NavinException e){
            System.out.println("This is an default 18");
        }
    }
}
