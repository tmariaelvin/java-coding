package latest;

import java.util.Scanner;

public class matrixcheck {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the row and coloum");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int [r][c];
        int flag=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               a[i][j]=sc.nextInt();
              b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(" "+a[i][j]);
             // System.out.print(" "+b[i][j]);

            }
            System.out.println();
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               // System.out.print(" "+a[i][j]);
                System.out.print(" "+b[i][j]);

            }
            System.out.println();
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]!=b[i][j])
                {
                    flag=1;
                    break;
                }
            }

        }
        if(flag==1)
        {
            System.out.println("Not same");
        }
        else
        {
            System.out.println("same");
        }

    }
}
