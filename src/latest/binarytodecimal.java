package latest;

import java.util.Scanner;

public class binarytodecimal {
    public static int power(int rem,int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return rem;
        }
        return power(rem,n-1)*rem;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,rem=0,decimal=0,m=0;

        int base=1;
        while(n>0)
        {
            rem=n%10;
            decimal=decimal+rem*base;
            n=n/10;
            base=base*2;
        }
        System.out.println(" "+decimal);
    }
}
