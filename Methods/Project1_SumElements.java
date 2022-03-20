package Methods;

import java.util.ArrayList;

public class Project1_SumElements {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(23);
        arr.add(92);
        System.out.println(sum(arr));
    }
    public static int sum(ArrayList<Integer> arr)
    {
        int sum=0;
        for(int i=0 ; i< arr.size(); i++)
        {
            sum += arr.get(i);
        }
        return sum;
    }
}
