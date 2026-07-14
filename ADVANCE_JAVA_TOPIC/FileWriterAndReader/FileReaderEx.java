package FileWriterAndReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[]args){
        String fileName = "Student.txt";
        try(FileReader reader = new FileReader(fileName)) {
            int ch;
            do{
                ch = reader.read();
                System.out.print((char) ch);
            }while(ch != -1);
            //For More Explaination use this link https://chatgpt.com/g/g-p-69fee74afec0819195faf2cb30a3e488/c/6a410395-ce00-83ee-98c0-80cde6d0cfd7
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

