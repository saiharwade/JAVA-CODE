package FileWriterAndReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Challenge88 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the book you wish to read: ");
        String NameofFile = input.next();

        try (FileReader fw = new FileReader(NameofFile)) {

            int ch;

            while ((ch = fw.read()) != -1) { //read() method always iterates to the next char automatically. so when ever the loop runs it remembers the last item.
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
}