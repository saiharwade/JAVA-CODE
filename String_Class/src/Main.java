class Sting_class{
    public static void main(){
        //string are always count in objects, but when we store it as string var1 = "" it can be compared with the other string variable which is declared in the same way.

        //ex

        String new1 = "hello1";
        String new2 = "hello";
        if(new1 == new2){
            System.out.println("true");
        }
        //if both variable have same value then they point to the same reference.
        //but these normally declared can only be compared with ==.
        // other for ex
        //if we declared strings like proper objects

        String ex1 = new String("world");
        String ex2 = new String("world");

        if(ex1.equals(ex2)){
            System.out.print("true");
        }
        // so here when we compare the two objects then we have to write with using equals() method.
    }
}