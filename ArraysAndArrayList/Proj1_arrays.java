package ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Proj1_arrays {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int[] arr=new int[5];
        for(int i=0 ; i < arr.length ; i++)
        {
            arr[i]=keyboard.nextInt();
        }
        for(int num : arr)
        {
            System.out.println(num*2);
        }
    }

}
