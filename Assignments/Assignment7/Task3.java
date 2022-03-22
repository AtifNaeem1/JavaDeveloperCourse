package Assignments.Assignment7;

import java.util.Scanner;
interface Name{
    public void setName(String name);
    public void displayName();
}
interface RollNo{
    public void setRoll(int roll);
    public void displayRoll();
}
interface City{
    public void setCity(String city);
    public void displayCity();

}
interface StudentDetails extends Name, RollNo, City {
    public void getDetails();

}
class Student implements StudentDetails{
    String name, city;
    int roll;


    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void displayName() {
        System.out.println(name);
    }

    @Override
    public void setRoll(int roll) {
        this.roll=roll;
    }

    @Override
    public void displayRoll() {
        System.out.println(roll);
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void displayCity() {
        System.out.println(city);
    }

    @Override
    public void getDetails() {

    }
};

class Task3 {

    static void method1(Name i) {
    };
    static void method2(RollNo i) {
    };
    static void method3(City i) {
    };
    static void method4(StudentDetails i) {
    };

    public static void main(String[] args) {
        Student s = new Student();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of Student");
        String name = input.nextLine();

        System.out.println("Enter city");
        String city = input.nextLine();

        System.out.println("Enter roll number of student");
        int roll = input.nextInt();
        System.out.println();



        s.setName(name);
        s.setRoll(roll);
        s.setCity(city);
        s.displayName();
        s.displayRoll();
        s.displayCity();

    }
}
