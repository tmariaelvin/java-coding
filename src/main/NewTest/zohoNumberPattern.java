package main.NewTest;

import java.util.Scanner;

public class zohoNumberPattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,x,y;
        //y=n;
        for(i=1;i<=n;i++)
        {
            x=n-i+1;
            y=i;
            for(j=1;j<=n;j++)
            {
                if(j%2==1)
                {
                    System.out.print(" " + x);
                }
                else {
                    System.out.print(" " + y);
                }
                    x=x+n;
                    y=y+n;
            }
            System.out.println();
        }
    }
}
