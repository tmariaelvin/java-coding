package main.incubation;
import java.util.Scanner;
public class deletearrayelement {
    public static int[] del(int a[],int x,int n)
    {
        int i=0;
        int b[]=new int[n];
        if(x>n&&x<0)
        {
            return a;
        }
        else
        {
            for(i=x+1;i<n;i++)
            {
                a[i-1]=a[i];
            }

        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[0];
        int i,x,j=0,m=2,l=0;
        for( i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
           // System.out.println(a[i]);
        }
         x=sc.nextInt();
               while(n>x) {
                   b = del(a, x, n);
                   n--;
                   x++;
                   for (i = 0; i < n; i++) {

                       System.out.print("\t" + b[i]);
                   }
                   System.out.println();
                   m--;
               }
            }
        }

