package main.latest;

import java.util.Scanner;

public class matrixoddoreven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the row and coloum");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
       // int b[][] = new int[r][c];
        int flag = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
                //  b[i][j]=sc.nextInt();
            }
        }
        int size=0,count=0;
        size=r*c;
        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                   if(a[i][j]==0)
                   {
                      count++;
                   }
                }
        }
        if(count>size/2)
        {
            System.out.println(" sparse matrix");
        }
        else
        {
            System.out.println(" not sparse matrix");
        }


        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(" " + a[i][j]);
                // System.out.print(" "+b[i][j]);

            }
            System.out.println();
        }

    }
}
