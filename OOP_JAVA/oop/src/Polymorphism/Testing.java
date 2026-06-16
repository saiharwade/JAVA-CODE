package Polymorphism;

class Testing1 {
    public void show(){
        System.out.print("HEllo1");
    }
}

class Testing2 extends Testing1{

    @Override
    public void show(){
        System.out.print("HEllo1");


    }
    public static void main(String[]args){
        Testing1 obj = new Testing2();
        obj.show();
    }


    /*
    class A {
        int x = 10;
}

    class B extends A {
        int x = 20;
}

    A obj = new B();

    System.out.println(obj.x);*/
}



