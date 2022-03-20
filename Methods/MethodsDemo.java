package Methods;

public class MethodsDemo {
    public static void main(String[] args) {
        printHello();
        printNumber(16);
        int result = giveMe10();
        double dResult;
        System.out.println(result);

        result = addThese(3 , 5);
        System.out.println(result);

        dResult = square(6.5);
        System.out.println(dResult);

        System.out.println((int)square(7.5));


    }

    private static double square(double num) {
        return num * num;
    }

    private static int addThese(int num1, int num2) {
        return num1 + num2;
    }

    private static int giveMe10() {
        return 10;
    }

    private static void printNumber(int number) {
        System.out.println(number);
    }

    private static void printHello() {
        System.out.println("Hello");
    }
}
