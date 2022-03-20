package ArraysAndArrayList;

import java.util.Scanner;

public class WrapperFun {
    public static void main(String[] args) {
        String someValue="3.14159";
        double doubleValue = Double.parseDouble(someValue);
        System.out.println(doubleValue);

        doubleValue+=10;
        System.out.println(doubleValue);
    }
}
