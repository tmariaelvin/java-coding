package main.latest;

import java.util.Arrays;
import java.util.Scanner;

public class reversearray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main.Array Size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int length = arr.length;
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(" " + arr[i]);
        }


        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - i - 1] = temp;
        }
       // for (int i = 0; i < n; i++) {
            System.out.print(Arrays.toString(arr));
       // }
    }
}
