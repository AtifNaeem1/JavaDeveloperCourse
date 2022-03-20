package ArraysAndArrayList;

import java.util.Scanner;

public class MoreArrayFun {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int[] array = new int[10];

        for(int i=0 ; i<array.length ; i++)
        {
            array[i]=keyboard.nextInt();
        }

        for(int num:array)
        {
            System.out.println(num);
        }
    }


}
