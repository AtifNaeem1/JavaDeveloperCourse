package ControlStatements;

import java.util.Scanner;

public class EvenOnlyJava {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        for(int i=0;i<=10;i++)
        {
            if(i%2!=0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
