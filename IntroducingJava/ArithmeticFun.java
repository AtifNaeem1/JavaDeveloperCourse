package com.company.IntroducingJava;

public class ArithmeticFun  {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int result=a+b;
        int difference=a-b;
        int product=a*b;
        int quotient=b/a;
        int remainder = b%a;
        System.out.println("sum= " + result);
        System.out.println("Difference is" + difference);
        System.out.println("Product is" + product);
        System.out.println("Quotient is" + quotient);
        System.out.println("remainder is  " + remainder);
        result+=20;
        System.out.println("result is now " + result);
        result++;
        System.out.println("result is now " + result);
        result--;
        System.out.println("result is now " + result);
    }
}
