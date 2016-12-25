package PrimeFactorExercise;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by urmil on 14/12/16.
 */
public class PrimeFactors {
    public static boolean isPrime(int n){

        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return  false;
        }
        return true;
    }

    public static ArrayList generate(int n) {

        ArrayList<Integer> arrayList= new ArrayList<>();

        for(int i=2;i<=n;i++)
        {
            if(n%i==0 && isPrime(i))
            {
                arrayList.add(i);
            }
        }

        return arrayList;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number whose prime factors you want to see : ");
        int n=sc.nextInt();

        ArrayList<Integer> arrayList= generate(n);
        if(!arrayList.isEmpty())
        {
            for(int val : arrayList)
                System.out.print(val + "  ");
        }
        else
            System.out.println("No factors found");

        sc.close();
    }
}
