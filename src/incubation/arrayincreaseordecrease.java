package incubation;
import java.util.Scanner;
public class arrayincreaseordecrease {
    /*  \\\\\ REMOVE ONE ELEMENT AND CHECK THE ARRAY IS INCREASE TRUE OR FALSE   /////

    public static void print(int []a,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(" \t"+a[i]);
        }
        System.out.println();

    }
    public static int[] remove(int []a,int start,int n)
    {
        if(start>n)
        {
            return a;
        }
        for(int i=start+1;i<n;i++)
        {
            a[i-1]=a[i];
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,count=0;
        int x;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        x=sc.nextInt();
        remove(a,x,n);
        n--;
        print(a,n);
        for(i=0;i<n-1;i++)
        {
            if(a[i]<a[i+1])
            {
              count++;
            }
            else
            {
                System.out.println("not increase");
                break;
            }
        }
        if(count==n-1)
        {
            System.out.println(" increase");
        }
    }

             ////  DECREASE IN SAME METHOD \\\\\


    */
    public static void print(int []a,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(" \t"+a[i]);
        }
        System.out.println();

    }
    public static int[] remove(int []a,int start,int n)
    {
        if(start>n)
        {
            return a;
        }
        for(int i=start+1;i<n;i++)
        {
            a[i-1]=a[i];
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,count=0;
        int x;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        x=sc.nextInt();
        remove(a,x,n);
        n--;
        print(a,n);
        for(i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                count++;
            }
            else
            {
                System.out.println("not increase");
                break;
            }
        }
        if(count==n-1)
        {
            System.out.println(" increase");
        }
    }
}
