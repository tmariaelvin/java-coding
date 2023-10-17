package main.L2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code1 {

    public static void main(String[] args){
        int incres =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        int result;
        List<Integer> resultArray = new ArrayList<>();
        for(int i=0;i<arraySize;i++){
            array[i] = sc.nextInt();
        }
        int k = 10;
        result = array[array.length-1];
        for(int i=array.length-2;i>=0;i--){
            result = result + array[i] * k ;
            k = k * 10;
        }
      System.out.println(result+incres);

        int res = result+incres;
        for(int i = 0;i<=res;i++ ){
           int  results = res % 10 ;
            res/=10;
            resultArray.add(results);
        }
    }
}
