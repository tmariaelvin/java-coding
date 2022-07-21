package incubation;
import java.util.Arrays;
import java.util.Scanner;
public class checktwonumber {
    public int count=0;
    public static int[] remove(int a[],int start,int x)
    {
        int index;
        for(index=start+1;index<x;index++) {

                a[index-1] = a[index];
            }
        return a;
    }
    public static void check(int a1[],int b1[],int x,int y)
    {
        int flag=0;
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                if(a1[i]==b1[j])
                {
                    flag=1;
                    remove(b1,j,y);
                    --y;
                    break;
                }
            }
            System.out.println(Arrays.toString(b1));
            if(flag==0)
            {
                System.out.println("different");
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("same");
        }


    }
    public static int[] checkarray(int l,int x,int a[])
    {
         a=new int[x];
        int rem=0,i=0;
        while(l>0)
        {
            rem=l%10;
            a[i++]=rem;
            l/=10;
        }
        return a;
    }
    public static int countcheck(int n)
    {
        int count=0;
        while(n>0)
        {
            n/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,x=0,y=0;
        int a1[] = new int[0],b1[]=new int[0];
        a=sc.nextInt();
        b=sc.nextInt();
        x=countcheck(a);
        y=countcheck(b);
        if(x==y)
        {
           a1= checkarray(a,x,a1);
            b1=checkarray(b,y,b1);
           // System.out.println(Arrays.toString(a1));

            check(a1,b1,x,y);
        }
        else
        {
            System.out.println("diffrent");
        }

    }
}
