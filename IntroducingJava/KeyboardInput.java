package com.company.IntroducingJava;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        System.out.println("What is your name");
        name = keyboard.nextLine();
        String city;
        int age;
        System.out.println("what is your age?");
        age = keyboard.nextInt();
        System.out.println("What city do you live ?");
        city = keyboard.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("Age is " + age);
        System.out.println("City is " + city);
    }
}
