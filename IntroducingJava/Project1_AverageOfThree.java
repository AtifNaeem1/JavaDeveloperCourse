package com.company.IntroducingJava;

import java.util.Scanner;

public class Project1_AverageOfThree {

    private static double firstNumber;
    private static double secondNumber;
    private static double thirdNumber;
    private static double average;

    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        System.out.println("Enter first number");
        firstNumber=keyboard.nextDouble();

        System.out.println("Enter second number");
        secondNumber=keyboard.nextDouble();

        System.out.println("Enter third number");
        thirdNumber=keyboard.nextDouble();

        average = (firstNumber + secondNumber + thirdNumber)/3.0;

        System.out.println("Average is " + average);
    }
}
