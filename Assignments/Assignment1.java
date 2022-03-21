package Assignments;

import java.io.File;
import java.util.Scanner;

public class Assignment1 {


    public static void main(String[] args){
        Assignment1 obj =new Assignment1();
        obj.findFile();
    }


    private void findFile()
    {
        Scanner in = new Scanner(System.in);
        File file = new File("E:\\Atif"); // address of files or folder where to search

        String fileName ;

        do{
            boolean found = false;
            System.out.println("Enter name of folder or file with extension ");
            fileName =in.nextLine();

            //list of file is stored in string
            String[] listOfFiles = file.list();

            //check each file or folder
            found = isFound(file, fileName, listOfFiles);

            //if file not found
            if(!found)
            {
                System.out.println("File not found");
                break;
            }
        } while(true);
    }

    private boolean isFound(File file, String fileName,String[] listOfFiles) {
        boolean found = false;
        for (String currFile : listOfFiles){
            if (fileName.equals(currFile))  //If file is present
            {
                found = true;
                System.out.println(currFile +" found at Path : "+ file.getAbsolutePath());
            }
        }
        return found;
    }
}
