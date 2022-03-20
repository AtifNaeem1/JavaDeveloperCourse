package ControlStatements;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Project3_GuessNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int computerNumber=random.nextInt(99) +1 ;

        System.out.println("Enter your number");
        int userNumber =  keyboard.nextInt();

        System.out.println("Compuet guessed number is " + computerNumber);
        if(userNumber == computerNumber)
        {
            System.out.println("Congratulations! You have guessed the number in number guessing game");
        }
        else if(userNumber >= 100 && userNumber <= 1)
        {
            System.out.println("That was a wasted guess! Pick a number between 1 and 100, inclusive");
        }
        else if(Math.abs(userNumber-computerNumber) >=20 )
        {
            if(userNumber > computerNumber)
            {
                System.out.println("Your guess was too high");
            }
            else
            {
                System.out.println("Your guess was too low");
            }
        }

    }
}
