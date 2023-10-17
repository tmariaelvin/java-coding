package main.test;


import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main.Array Size : ");
        int arrayLength = sc.nextInt();
        int inputArray[] = new int[arrayLength];

        System.out.println("Enter the value");
        for (int i = 0; i < arrayLength; i++) {
            inputArray[i] = sc.nextInt();
        }
        int temp = 0;
        int count = 0;
     /*   for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (inputArray[i] > inputArray[j]) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }*/
        int k=0;
        int result[]= new int[arrayLength];
        int len = arrayLength-1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 0) {
                result[len--] = 0;
            }
            else{
                result[k++] = inputArray[i];
            }
        }

        /*


        int nonZero = arrayLength - count;
        int k = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 0) {
                count++;
            } else {
                outPutArray[k++] = inputArray[i];
            }
        }

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }

        System.out.println("count" + count);

        for (int i = count; i < arrayLength; i++) {
            outPutArray[k++] = inputArray[i];
        }
        for (int j = 0; j < count; j++) {
            outPutArray[k++] = inputArray[j];
        }*/

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }


    }
}

