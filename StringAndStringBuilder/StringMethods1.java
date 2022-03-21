package StringAndStringBuilder;

import java.util.Scanner;

public class StringMethods1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name = "John Baugh";
        String name2 = "John Baugh";
        String name3 = "Rob Percival";

        for(int i=0 ; i < name.length() ; i++)
        {
            System.out.print(name.charAt(i));
        }
        System.out.println();

        if(name.equals(name2))
        {
            System.out.println("names are equal");
        }
        else
        {
            System.out.println("names are not equal");
        }

        if(name2.compareTo(name3) > 0)
        {
            System.out.println(name2 + " is greater than " + name3);
        }
        else
        {
            System.out.println(name3 + " is greater than " + name2);
        }
    }
}
