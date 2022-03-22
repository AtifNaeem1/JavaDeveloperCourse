package Assignments.Assignment6;

class Construct {
    private String name;
    private int roll;
    Construct(String name)
    {
        this.name = name;
    }
    Construct(String name, int roll)
    {
        this(name);
        this.roll = roll;
    }
    public void print()
    {
        System.out.println(name + "  " + roll);
    }
}
public class ConstructorQues1 {
    public static void main(String[] args) {
        Construct obj =new Construct("Naeem",100);
        obj.print();
    }
}