package StringAndStringBuilder;

import java.util.Locale;
import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String fullname;
        String firstname;
        String lastname;

        System.out.println("enter your full name");
        fullname=keyboard.nextLine();

        int indexOfSpace = fullname.indexOf(" ");

        firstname = fullname.substring(0,indexOfSpace);

        lastname = fullname.substring(indexOfSpace+1);

        firstname = firstname.toUpperCase();

        lastname = lastname.toLowerCase();

        System.out.println("first name is " + firstname);

        System.out.println("last name is " + lastname);
    }
}
