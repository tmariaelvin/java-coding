
package L2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        List<int[]> resultArray = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }
        int len = array.length;

     /*   for(int i=0;i<len;i++ ){
            int max =-99;
            int index = 0;
            for(int j= 0 ;j<3;j++){
                if(max < array[j] && (array[j] == -99)){
                    max = array[j];
                    index = j ;
                }
            }
            resultArray.add(max);
            array[index] = -99;
        }
        int results =1;
        for(int i =0 ;i<resultArray.size();i++){
            results = results * resultArray.get(i);
        }
        System.out.println(results);
*/


        int results;
        int firstIndex, secondIndex, threeIndex;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    firstIndex = i;
                    secondIndex = j;
                    threeIndex = k;
                    results = array[i] * array[j] * array[k];
                    resultArray.add(new int[]{results, firstIndex, secondIndex, threeIndex});
                }
            }
        }

        for (int[] currentArray : resultArray) {
            Arrays.sort(currentArray);
        }

    }
}


