package main.NewTest;

import java.util.Scanner;

public class primenumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0,i,j;
       // for ( j = 1; j < n; j++) {
        //    flag=0;
            for (i = 2; i <=n/2; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print("\t Number is prime "+n);
            }
            else{
                System.out.println("Normal Number");
            }
       // }
    }
    }

