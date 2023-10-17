package main.advancelevel;
import java.util.Scanner;
public class missingnumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,total=1;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=2;i<n+2;i++)
        {
            total+=i;
            total-=a[i-2];
        }
        System.out.println(total);
    }
}
