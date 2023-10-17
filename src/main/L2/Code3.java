package main.L2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        List<Integer> resultArray = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }
        int len = array.length;

        for(int i=0;i<len;i++){
            if(i % 2 == 0){
                int min = 999;
                int index =0;
                int j=0;
                    for(int k=j;k<len;k++){
                        if((min > array[k]) && (array[k] >=0) ){
                            min = array[k];
                            index = k ;
                        }
                    }

                resultArray.add(min);
                array[index] = -99;
            }
            else {
                int max =  0;
                int index =0;
                    for(int m=0;m<len;m++){
                        if((max < array[m]) && (array[m] >=0)  ){
                            max = array[m];
                            index = m ;
                        }
                    }

                resultArray.add(max);
                array[index] = -99;
            }

        }
        System.out.println(resultArray);

    }

}
