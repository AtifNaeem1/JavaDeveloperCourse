package Assignments.Assignment7;

interface Cycle2{
    void code();
    void factories();

}
class Unicycle2 implements Cycle2{
    public void code(){
        factories();
    }
    public void factories(){
        System.out.println("Code of Unicycle is U_cyc.");
    }

};
class Bicycle2 implements Cycle2{
    public void code(){
        factories();
    }
    public void factories(){
        System.out.println("Code of Bicycle is B_cyc.");
    }
};
class Tricycle2 implements Cycle2{
    public void code(){
        factories();
    }
    public void factories(){
        System.out.println("Code of tricycle is T_cyc.");
    }
};
public class Task4 {
    public static void main(String[] args){
        Unicycle2 obj = new Unicycle2();
        obj.code();
        Bicycle2 obj1 = new Bicycle2();
        obj1.code();
        Tricycle2 obj2 = new Tricycle2();
        obj2.code();
    }
}
