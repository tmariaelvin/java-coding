package main.NewTest;

import java.util.Scanner;

public class differentnumberpattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, y, x;

        //y = n;
        for (i = 1; i <= n; i++) {
            x = 1;
            for (j = 1; j <= i; j++) {

                    System.out.printf(" "+x);
                    x=x*(i-j)/j;

            }
            System.out.println();
        }
    }
}
