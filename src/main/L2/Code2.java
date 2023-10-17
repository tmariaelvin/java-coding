package main.L2;

import java.util.Scanner;

public class Code2 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the array size");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        for(int i =0;i<arraySize;i++){
            array[i] = sc.nextInt();
        }
       int len = array.length;
        for(int i =0 ;i< len ; i++) {
            for (int j = i+1 ; j<len ;j++){
                if(array[i] == array[j]) {
                    array[j] = -99;
                 }
            }
        }

        for (int j : array) {
            if (j != -99) {
                System.out.print(j + ",");
            }
        }

    }
}
