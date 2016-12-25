package Triangle;

import java.util.Scanner;

/**
 * Created by urmil on 14/12/16.
 */
public class HorizontalLine {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter value of n : ");
        int n=sc.nextInt();

        System.out.println();
        for(int i=0;i<n;i++)
            System.out.print("*");

        sc.close();
    }
}
