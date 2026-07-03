package FileWriterAndReader;

import java.io.FileWriter;
import java.io.IOException;


public class FileWriterEx {
    public static void main(String[]args){
        String fileName = "Student.txt";

        try(FileWriter writer = new FileWriter(fileName)){ // we write the object inside the try() because it gives us the functionality of automatically closing the resources.
            //otherwsie if we declared the object inside the curly brack then and suppose we created more than one object then the finally block will get confuse by which object/resource it should close actually,
            writer.write("This is My Practice file");
            writer.flush();

        }
        catch(IOException e){
            System.out.println("Exception Occured");
            e.getMessage();
        }


    }
}
