package test;

import java.util.Scanner;

public class L11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size : ");
        int arrayLength = sc.nextInt();
        int inputArray[] = new int[arrayLength];

        System.out.println("Enter the value");
        for (int i = 0; i < arrayLength; i++) {
            inputArray[i] = sc.nextInt();
        }
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 0) {
               int temp = inputArray[i];
                for(int j = i ;j<arrayLength-1;j++){
                    inputArray[i] = inputArray[i+1];
                }
                inputArray[arrayLength-1] = temp;
            }
        }

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]);
        }
    }

}
