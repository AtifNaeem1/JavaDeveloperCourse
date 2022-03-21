package FileInputOutput;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputfun {
    public static void main(String[] args) {

        try
        {
            PrintWriter pw = new PrintWriter("output.txt");

            pw.println("Hello there..");
            pw.println("This is Atif Naeem");
            pw.close();

        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }
    }
}
