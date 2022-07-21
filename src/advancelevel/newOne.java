package advancelevel;

import java.util.Scanner;

public class newOne {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the remove index");
        int index=sc.nextInt();
        int flag=0;

                if(index<n)
                {
                    flag=1;
                    for(int j=index+1;j<n;j++)
                    {
                        a[j-1]=a[j];

                    }
                    n--;

                }


        for(int i=0;i<n;i++)
        {
            System.out.print(a[i] );
        }
    }
}
