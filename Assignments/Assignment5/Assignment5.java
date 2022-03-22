package Assignments.Assignment5;

class Data
{
    private int roll;
    private char grade;
    public void printInstanceVariable()
    {
        System.out.println(roll + " " + grade);
    }
    public void printLocalVariable()
    {
        int localRoll;
        char localGrade;
//        System.out.println(localRoll + " " + localGrade);

//        you can't access local variables (the variables that you declare inside
//        a method) unless they are initialized before accessing.

    }
}
class Singleton
{
    String name;

//    A static method can access only static members and can not access non-static members

//    public static Singleton setNameAndReturnInstance(String name)
//    {
//        this.name = name;
//    }

    public void printName()
    {
        System.out.println(name);
    }
}
public class Assignment5 {


    public static void main(String[] args) {
        Data dataObject = new Data();

        dataObject.printInstanceVariable();
        dataObject.printLocalVariable();

//        Singleton singletonObject = Singleton.setNameAndReturnInstance("Naeem");
       ( new Singleton()).printName();
    }
}
