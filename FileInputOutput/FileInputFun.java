package FileInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class FileInputFun {
    public static void main(String[] args) {
        Scanner inFile;
         try
         {
             inFile = new Scanner(new File("input.txt"));

             int input;

             while(inFile.hasNext())
             {
                 input = inFile.nextInt();
                 System.out.println(input);
             }
             inFile.close();
         }
         catch(FileNotFoundException e)
         {
             System.out.println("File not found");
             System.out.println(e.getMessage());
         }
         catch(InputMismatchException e)
         {
             System.out.println("Error ");
         }
    }
}
