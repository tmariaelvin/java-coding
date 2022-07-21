package Testing;

import java.util.Scanner;
public class factrecurion {
    public static  void main(String[] args)
    {
        int n,i,sum;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(n);
        sum=fact(n);
        System.out.println(sum);
    }
    public static int fact(int n)
    {
        if(n==0) {
            return 1;
        }
        else
        {
         return (n*fact( n-1));
        }
    }
}
