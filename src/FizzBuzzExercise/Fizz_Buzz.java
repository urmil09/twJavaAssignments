package FizzBuzzExercise;

/**
 * Created by urmil on 14/12/16.
 */
public class Fizz_Buzz {
    public static void fizzBuzz(int start, int end)
    {
        for(int i=start;i<=end;i++)
        {
            if(i%3==0 && i%5==0)
                System.out.println("FizzBuzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        int start=1;
        int end= 100;
        fizzBuzz(start, end);
    }
}
