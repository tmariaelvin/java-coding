package main.advancelevel;
import java.util.Scanner;
public class sumofpairvalue {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the pair sum");
        int n,i,count=0,j,sum,check=0,index=0,end=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sum=sc.nextInt();
        System.out.println(sum);
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                check=a[i]+a[j];
                if(check==sum)
                {
                    count++;
                    index=i;
                    end=j;
                    System.out.println(( index+" , "+end )+"="+sum);
                }
            }
        }
        System.out.println(" NUMBER OF PAIR IN THIS ARRAY : "+count);
    }
}
