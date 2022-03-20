package ControlStatements;

import java.util.Scanner;

public class FraternityChallenge {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        char gender;

        System.out.println("Enter your age");
        age=keyboard.nextInt();

        System.out.println("Enter your gender, Type M for male, F for female");
        gender=keyboard.next().charAt(0);

        if(age>=19 && gender=='M')
        {
            System.out.println("You can join the fraternity");
        }
        else
        {
            System.out.println("Sorry, You can't join the fraternity");
        }

    }
}
