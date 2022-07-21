package sample;

import java.util.Scanner;
public class amsrongnum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,rem,sum=0,x,y;
        n=sc.nextInt();
        System.out.println(n);
        x=n;
        y=digit(n);
        System.out.println(y);
        while(n>0)
        {
            rem=n%10;
            sum=sum+pow(rem,y);
            n/=10;
        }
        if(sum==x)
        {
            System.out.println("armstrong\t"+sum+" ");
        }
        else
        {
            System.out.println("not amstrong\t"+sum+ " ");
        }
    }
    public static int digit(int n)
    {
        int count=1;
        if(n/10==0)
        {
        return 1;
        }
        else
        {
         return (count+digit(n/10));
        }
    }
    public static int pow(int n,int y)
    {
        if(y==0||y==1)
        {
            return n;
        }
        else
        {
            return n*pow(n,y-1);
        }
    }
}
