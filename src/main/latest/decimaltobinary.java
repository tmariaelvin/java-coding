package main.latest;

import java.util.Scanner;
/*
main.sample input :
125
        1111101
        */

public class decimaltobinary {
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Decimal number");
        int n=sc.nextInt();
        int count=0,rem=0,decimal=0,m=0;
        int a[]=new int[100];

        int base=1;
        while(n>0)
        {
            rem=n%2;
            a[m++]=rem;
            n=n/2;
        }
        for(int i=m-1;i>=0;i--)
        {
            System.out.print(a[i]);
        }
    }
}
