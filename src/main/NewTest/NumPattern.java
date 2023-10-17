package main.NewTest;

import java.util.Scanner;

public class NumPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, y, x;

        //y = n;
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n; j++) {

                System.out.printf(" "+Math.abs(i-j+1));
            }
            System.out.println();
        }
    }
}
