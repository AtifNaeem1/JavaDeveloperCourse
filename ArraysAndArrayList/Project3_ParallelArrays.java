package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Project3_ParallelArrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> age=new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();

        for(int i=0 ; i<5 ; i++)
        {
            System.out.println("Enter name");
            String s= keyboard.nextLine();


            System.out.println("Enter age");
            int n= keyboard.nextInt();

            keyboard.nextLine();

            name.add(s);
            age.add(n);
            System.out.println();
        }
        for(int i=0 ; i<5 ; i++)
        {
            System.out.println(name.get(i) + " is " + age.get(i) + " years old");
        }
    }
}
