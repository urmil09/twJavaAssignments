package Triangle;

import java.util.Scanner;

/**
 * Created by urmil on 14/12/16.
 */
public class RightTriangle {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter value of n : ");
        int n=sc.nextInt();

        System.out.println();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }

        sc.close();
    }
}
