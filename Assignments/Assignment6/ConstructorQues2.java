package Assignments.Assignment6;

class Const
{
    Const(String argument)
    {
        System.out.println(argument);
    }
}
public class ConstructorQues2 {
    public static void main(String[] args) {
        Const[] objectArr = new Const[2];

        objectArr[0] = new Const("Hello");
        objectArr[1] = new Const("World");
    }
}
