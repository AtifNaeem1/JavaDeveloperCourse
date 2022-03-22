package Assignments.Assignment7;

class OuterClass1{
    OuterClass1(){
        System.out.println("Outer1 class constructor is running.");
    }
    class InnerClass1{
        InnerClass1( int a,int b){
            System.out.println("The value of a is " +a);
            System.out.println("Inner1 class constructor is running.");
        }
    }
};

class OuterClass2 extends OuterClass1{
    OuterClass2(){
        System.out.println("Outer2 class constructor is running.");
    }
    class InnerClass2{
        InnerClass2(int a){
            System.out.println("The value of a is " +a);
            System.out.println("Innr2 class constructor is running.");
        }
    }
};

public class Task5{
    public static void main(String[] args){
        OuterClass2.InnerClass2 in = new OuterClass2().new InnerClass2(100);

    }

}