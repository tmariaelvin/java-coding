package main.NewTest;

import java.util.Scanner;

public class pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        int x=0,y=0;
        x=0;
        y=n-1;
        for(i=1;i<=n;i++) {
            for(j=1;j<=n;j++){
                if((j>=n-x||j==n)||(j==1||j<=n-y)){                      ///   if ( j>n-i )  Right side print pattern  ////
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            if(i<=n/2){
            x++;
            y--;
            }
            else{
                x--;
                y++;
            }
            System.out.println();
        }
    }


}
