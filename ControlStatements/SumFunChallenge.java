package ControlStatements;

import java.util.Scanner;

public class SumFunChallenge {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int sum=0,currentNumber;

        System.out.println("Enter a number");
        currentNumber=keyboard.nextInt();

        while(currentNumber >= 0)
        {
            sum += currentNumber;

            System.out.println("Enter the next number");
            currentNumber= keyboard.nextInt();
        }
        System.out.println("sum = " + sum);
    }
}
