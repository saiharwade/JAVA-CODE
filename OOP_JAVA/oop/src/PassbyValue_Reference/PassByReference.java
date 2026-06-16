package PassbyValue_Reference;

class PassByReference {
    int x;
    int y;

    public PassByReference(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static void move(PassByReference h){
        h.x++;
        h.y++;
    }

    public static void main(String[]args){
        PassByReference p = new PassByReference(5,8);
        System.out.println("x = " + p.x + ", y = " + p.y);
        move(p);
        System.out.println("x = " + p.x + ", y = " + p.y);
    }
    @Override
    public String toString() {
        return "PassByReference{x=" + x + ", y=" + y + "}";
    }

    /*This explain us the functionality of pass by reference
    * In this the reference of the object is pass, so any modification in the reference would change the value of the actual object
    * Cause even though it is the copy of the reference is change so the copy also points to the actual address so it can affect the original object as well*/

    //PassByValue works on Primitive data types along with String cause string is immutable
    //Whereas PassByReference Works on objects and there reference.
}
