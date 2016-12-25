package Diamond;

import java.util.Scanner;

/**
 * Created by urmil on 14/12/16.
 */
public class DiamondShape {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter value of n rows : ");
        int n=sc.nextInt();

        System.out.println();

        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n-i-1;j++)
                System.out.print(" ");
            for(int j=1;j<=(2*i)+1;j++)
                System.out.print("*");

            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int j=1;j<=(2*i)-1;j++)
                System.out.print("*");

            System.out.println();
        }
        sc.close();
    }
}
