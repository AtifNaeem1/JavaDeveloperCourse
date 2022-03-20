package ControlStatements;

import java.util.Scanner;

public class Project2_DivisibeByeThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;

        System.out.println("Enter any integer");
        number=keyboard.nextInt();

        if(number % 3 ==0)
            System.out.println("Divisible b y 3");
        else
            System.out.println("Not Divisible by 3");
    }
}
