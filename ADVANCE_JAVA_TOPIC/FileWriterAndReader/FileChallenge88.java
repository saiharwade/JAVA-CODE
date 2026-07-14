package FileWriterAndReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileChallenge88 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the File Name with .txt ahead of the file name: ");
        String name = input.nextLine();

        try(FileWriter writer = new FileWriter(name)){
            writer.write("HEy Guys Whatsupp!");
        }catch(IOException e){
            e.getMessage();
        }

        try(FileReader reader = new FileReader(name)){
            int ch;
            while((ch = reader.read()) != -1){

            }
        }catch(FileNotFoundException f){
            f.getMessage();
        }catch(IOException e){
            e.getMessage();
        }
    }
}
