package TypesOfClasses.StaticNestedClass;

public class Computer {

    private String name;

    private int price;

    public Computer(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public static class USB{

        private String USB;

        public USB(String USB) {
            this.USB = USB;
        }
    }

    public static void main(String[]args){

        Computer.USB usb = new Computer.USB("Type c");
        //This is Called Static Nested Class Where we Don't want the Instance/Object of the Parent Class.There is no Dependency.

    }
}
