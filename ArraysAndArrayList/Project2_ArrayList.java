package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Project2_ArrayList {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true)
        {
            System.out.println("Enter any non negative integer");
            int num= keyboard.nextInt();
            if(num<0)
            {
                break;
            }
            list.add(num);
        }

        for(int i= list.size()-1 ;  i>=0;i--)
        {
            System.out.println(list.get(i));
        }
    }
}
