package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> list= new ArrayList<>();

        list.add("Ajay");
        list.add("Vijay");
        list.add("Abdul");
        list.add("Dhananjay");
        list.add("Dami");

        for(int i=0 ; i< list.size() ; i++)
        {
            System.out.println(list.get(i));
        }

        for(String name:list)
        {
            System.out.println(name);
        }
    }
}
