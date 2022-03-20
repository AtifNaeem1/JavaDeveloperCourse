package com.company.IntroducingJava;

import java.util.Scanner;

public class Project2__MadLibsClone {
    private static String adjective;
    private static String name;
    private static String object;
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Adjective");
        adjective=keyboard.nextLine();

        System.out.println("Enter Person name");
        name=keyboard.nextLine();

        System.out.println("Enter object");
        object=keyboard.nextLine();

        System.out.println("I know a " + adjective + " person named " + name + " who is planning to buy a " + object);
    }
}
