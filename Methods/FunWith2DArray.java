package Methods;

import java.util.Random;

public class FunWith2DArray {
    public static void main(String[] args) {
        int[][] my2DArray =  new int[2][3];

        full2DArray(my2DArray);

        print2DArray(my2DArray);
    }
    public static void full2DArray(int[][] twoDArr)
    {
        Random rand = new Random();

        for(int i=0; i<twoDArr.length ; i++)
        {
            for(int j=0 ; j < twoDArr[i].length ; j++)
            {
                twoDArr[i][j] = rand.nextInt(100);
            }
        }
    }
    public static void print2DArray(int[][] twoDArr)
    {
        for(int[] arr : twoDArr)
        {
            for(int num : arr)
            {
                System.out.print(num + " ");
            }
            System.out.println(   );
        }
    }
}
