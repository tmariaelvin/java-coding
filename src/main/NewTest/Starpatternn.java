package main.NewTest;

import java.util.Scanner;

public class Starpatternn {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,x,y;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i%2==1) {
                    if (j % 2 == 0) {
                        System.out.print("* ");
                    }
                else
                    System.out.print("  ");
                }
                else {
                    if(j%2==1){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }

                    }

            }
            System.out.println();
        }
    }
}
