package practice;

import java.util.Arrays;
import java.util.List;

public class MoveZeroLast {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 2, 4, 0, 2, 5};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp;
            if (arr[i] != 0 && arr[j] == 0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0)
                j++;
        }

        for(int result : arr){
            System.out.print(result+" ");
        }
        /*List<Integer> list = Arrays.asList(1,2,34,5);
        list.forEach(System.out::println);*/

    }
}
