package main.advancelevel;
import java.util.Scanner;
public class copyarrayelement {

    //
     //      same array or different array in store and view
    //

public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n,i,j,k=0;
    n=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        if(a[i]%2==0)
        {
            a[k]=a[i];
            k++;
        }
    }for(i=0;i<k;i++)
    System.out.print("\t"+a[i]);
}

}
