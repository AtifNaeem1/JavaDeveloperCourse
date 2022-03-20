package Methods;

public class CountDown {
    public static void main(String[] args) {
        countUpTo(0,5);
        countDownForm(5);
    }
    public static void countDownForm(int num)
    {
        if(num >= 0)
        {
            System.out.println(num);
            countDownForm(num - 1);
        }
    }
    public static void countUpTo(int from, int to)
    {
        if(from <= to)
        {
            System.out.println(from);
            countUpTo(from+1 , to);
        }
    }
}
