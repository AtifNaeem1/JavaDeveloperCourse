package Assignments;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment9 {
    public void Check(String s1) {
        String regexPattern="[A-Z].*[.]";
        boolean flag= Pattern.matches(regexPattern, s1);
        if(flag){
            System.out.println("Yes the given pattern matches the regex: "+flag);
        }
        else{
            System.out.println("No the given pattern does not matches the regex: "+flag);
        }
    }

    public static void main(String[] args)
    {
        String s1;
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the string: ");
        s1 = in.nextLine();
        Assignment9 obj = new Assignment9();
        obj.Check(s1);
    }
}
