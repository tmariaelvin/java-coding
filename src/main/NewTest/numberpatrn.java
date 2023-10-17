package main.NewTest;

import java.util.Scanner;

public class numberpatrn {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, y, x;
        x = 1;
        y = n;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if(i%2==1)
                {
                    System.out.printf("  "+x++);
                }
                else
                {
                    System.out.printf("  "+x--);
                }
            }
            if(i%2==1){
            x=x+y-1;}else{
            x=x+y+1;}
            System.out.println();
        }
    }
}
