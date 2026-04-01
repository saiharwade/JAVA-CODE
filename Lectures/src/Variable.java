public class Variable{ // here we made a class and the name of class should same as that of file name and first Letter capital
    public static void main(String[] args){
        // main is method name with its argument pass in it
        int myNumber = 0; //after each instruction we should give ; to tell that the instruction is over
        System.out.println(myNumber);
        int newNo; // here we just said that reserve a memory of int for variable called newNo
        newNo = 77; //as we already reserve a space for variable newNo we don't have mention it as int newNo cause the variable is already there in the memory
        System.out.println(newNo);

        float myFloat = 5.0f; // as java by default consider it as bg or double float value, but we know it's a small value so we have to explicitly instruct him that it is float value.
        // we can write either small f or capital f to tell it's a float
        System.out.println(myFloat);

        float newFloat = 5;
        System.out.println(newFloat);

        double myDouble = 5.08888; // big decimal no is written as double

        boolean isVeg = true;
        System.out.println(isVeg);

        String wishes = "hello"; //stings are combination of characters
        System.out.println(wishes);

        char letter = 's'; // character are only one letter not more that that cause the memory allocation of strings are

        //in Java we have to mention the type of the data cause memory allotted to each data type is o different size
    }

}