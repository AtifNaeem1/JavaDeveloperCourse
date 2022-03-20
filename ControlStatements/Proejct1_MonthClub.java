package ControlStatements;

import java.util.Scanner;

public class Proejct1_MonthClub {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int packageNumber;
        int NumberOFCourses;
        int baseCost = 0;
        int costPerCourse=0;
        int numIncluded = 0;
        int totalCost;

        System.out.println("Which of the packages do you want?  1,2 or 3 ?  ");
        packageNumber=keyboard.nextInt();

        System.out.println("How many course did you enroll this month?");
        NumberOFCourses=keyboard.nextInt();

        switch (packageNumber)
        {
            case 1:
                baseCost=10;
                costPerCourse=6;
                numIncluded=2;
                break;
            case 2:
                baseCost=12;
                costPerCourse=4;
                numIncluded=4;
                break;
            case 3:
                baseCost=15;
                costPerCourse=3;
                numIncluded=6;
                break;
            default:
                System.out.println("No such package found");

        }
        if(NumberOFCourses > numIncluded)
        {
            totalCost = baseCost + (NumberOFCourses - numIncluded) * costPerCourse;
        }
        else
        {
            totalCost =baseCost;
        }
        System.out.println("Total cost is $" + totalCost);
    }
}
