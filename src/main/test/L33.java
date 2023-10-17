package main.test;

import java.util.Scanner;

public class L33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main.Array Size : ");
        int arrayLength = sc.nextInt();
        int inputArray[] = new int[arrayLength];

        System.out.println("Enter the value");
        for (int i = 0; i < arrayLength; i++) {
            inputArray[i] = sc.nextInt();
        }


        int flag = 0;
        for(int i=0;i<arrayLength;i++){
           flag =0 ;
           for(int j=i+1;j<arrayLength;j++){
               if(inputArray[i] == inputArray[j] && inputArray[i]!=-99 ){
                   flag =1;
                   inputArray[j] = -99;
                 break;
               }
           }
            if(flag == 0 && inputArray[i]!=-99){
                System.out.println(inputArray[i]);
            }
        }
    }
}
