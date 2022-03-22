package Assignments.Assignment7;

class Cycle{

}
class Unicycle extends Cycle{
    public void balance(){
        System.out.println("Unicycle");
    }
}
class Bicycle extends Cycle{
    public void balance(){
        System.out.println("Bicycle");
    }
}
class Tricycle extends Cycle{

}

public class Task2{
    public static void main(String[] args) {
        Cycle[] obj = new Cycle[3];

//        obj[0] = new Unicycle();
//        obj[0].balance();
////        It will show compilation error :  cannot find symbol
////        symbol:   method balance()
//        obj[1] = new Bicycle();
//        obj[1].balance();
//        obj[2] = new Tricycle();
//        obj[2].balance();

        Unicycle obj1 = new Unicycle();
        obj1.balance();

        Bicycle obj2 = new Bicycle();
        obj2.balance();
    }
}
