package Methods;

public class MethodOverloading {
    public static void main(String[] args) {
        int result = getResult(5);
        System.out.println(result);

        result =  getResult(5,4);
        System.out.println(result);

        result = getResult(5, "12");
        System.out.println(result);
    }
    public static int getResult(int number)
    {
        return number * 2;
    }

    public static int getResult(int number1 , int number2)
    {
        return number1 + number2;
    }
    public static int getResult(int number, String s)
    {
        return number * Integer.parseInt(s);
    }
}
