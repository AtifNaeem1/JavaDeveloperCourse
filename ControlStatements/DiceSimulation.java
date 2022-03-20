package ControlStatements;

import java.util.Random;
import java.util.Scanner;

public class DiceSimulation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random=new Random();
        int count=10;

        while(count>0)
        {
            System.out.println(random.nextInt(5) + 1);
            count--;
        }
    }
}


//    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//    }