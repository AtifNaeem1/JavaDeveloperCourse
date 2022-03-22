package Assignments.Assignment7;

abstract class Rodent{
    Rodent(){
        System.out.println("Constructor of Rodent is running.");
    }
    public abstract void intro();
    public abstract void life();
    public abstract void home();

} ;
class Mouse extends Rodent{
    Mouse(){
        System.out.println("Constructor of Mouse is running.");
    }
    public void intro()
    {
        System.out.println("I am Mouse... ");
    }
    public void life(){
        System.out.println("Our average life span 2-3 years.");
    }
    public void home(){
        System.out.println("I live in burrows");
    }
};
class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("Constructor of Gerbil is running");
    }

    @Override
    public void intro() {
        System.out.println("I am Gerbil");
    }

    @Override
    public void life() {
        System.out.println("My average life is 2-4 years");
    }

    @Override
    public void home() {
        System.out.println("I live in clay or sandy deserts");
    }

};
class Hamster extends Rodent{
    Hamster(){
        System.out.println("Constructor of Hamster is running");
    }
    @Override
    public void intro() {
        System.out.println("I am Hamster");
    }

    @Override
    public void life() {
        System.out.println("My average life is 2-4 years");
    }

    @Override
    public void home() {
        System.out.println("I live in warm, dry areas, like steppes, " +
                "sand dunes and the edges of deserts");
    }
};
public class Task1 {
    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[0].intro();
        rodent[0].home();
        rodent[0].life();
        System.out.println();
        rodent[1] = new Gerbil();
        rodent[0].intro();
        rodent[0].home();
        rodent[0].life();
        System.out.println();
        rodent[2] = new Hamster();
        rodent[0].intro();
        rodent[0].home();
        rodent[0].life();
    }
}
