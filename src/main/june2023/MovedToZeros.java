package main.june2023;

import java.util.Scanner;

public class MovedToZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main.Array size");
        int arrSize = sc.nextInt();
        int[] inputArr = new int[arrSize];
        System.out.println("Enter the value");
        for (int i = 0; i < arrSize; i++) {
            inputArr[i] = sc.nextInt();
        }

        int k = 0;
        //int temp = 0;
        for (int i = 0; i < arrSize; i++) {
            if (inputArr[i] != 0) {
                inputArr[k++] = inputArr[i];
            }
        }

        for(;inputArr.length>k;k++){
            inputArr[k] = 0;
        }
        for(int res : inputArr){
            System.out.println(res);
        }

    }
}
