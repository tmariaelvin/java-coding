package main.sample;

import java.util.Scanner;
public class factorial {
    public static void main(String[] args)
    {
        int fact=1,i,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       System.out.println(n);
       for(i=1;i<=n;i++)
       {
           fact=fact*i;
           System.out.print(fact+" ");
       }
    }
}
