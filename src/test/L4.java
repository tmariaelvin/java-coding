package test;

import java.util.Map;
import java.util.Scanner;

public class L4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size : ");
        int arrayLength = sc.nextInt();
        int inputArray[] = new int[arrayLength];

        System.out.println("Enter the value");
        for (int i = 0; i < arrayLength; i++) {
            inputArray[i] = sc.nextInt();
        }
        checkValueIsThere(inputArray);

    }
    public static void checkValueIsThere(int[] inputArray){
       for(int i=0;i<inputArray.length;i++){
           if(inputArray[i] == inputArray[i+1]){
               System.out.println(inputArray[i]);
               break;
           }
           if(inputArray[i] == inputArray[inputArray.length-1-i]){
               System.out.println(inputArray[i]);
               break;
           }
       }
    }
}
