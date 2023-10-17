package main.L2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int result = 0;
        for (int arr : array) {
            result ^= arr;
        }
        System.out.println(result);

    }
}
