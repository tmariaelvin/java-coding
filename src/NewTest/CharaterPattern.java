package NewTest;

import java.util.Scanner;

public class CharaterPattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x,i,j,y;
        x=n;
        y=n;
        for( i=1;i<=n;i++)
        {
            for( j=1;j<=n;j++) {
                if (i==1||i==n||j==1) {
                    // if(j==x||j==y||i==n||i==1){ fill the start fully..
                    System.out.print("* ");
                } else if((i>=n/2+1&&j==n)||(i==n/2+1&&j>=n/2)){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            x--;y++;
            System.out.println();
        }
    }
}
