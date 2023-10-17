package main.ModelL2;

import java.util.Scanner;

public class luckynumber {
    public static int[] remove(int a[], int start, int n) {
        int i;
        for (i = start + 1; i < n; i++) {
            a[i - 1] = a[i];
        }
        n--;
         // print(a,n);
        return a;
    }

    public static void print(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, k = 2, l = 1;
        System.out.print("Enter the size of element :");
        n = sc.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
       while (k <= n) {
            // System.out.print("  "+k );
            for (i = l; i < n; i = i + k-1) {
                // System.out.print("  : "+a[i]);
                remove(a, i, n);
                n--;
                // System.out.print(" "+a[i]);
            }
           k++;
            l=l+1;
        }
        print(a,n);
            }

}
