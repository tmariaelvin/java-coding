package sample;

import java.util.Scanner;

public class bubblesort {
    public static void main(String args[])
    {
        int n,i;
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++) {
            a[i] = sc.nextInt();
            System.out.print("\t"+a[i]);
        }
    }
}
