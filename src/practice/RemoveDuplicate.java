package practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 4};
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        int[] uniqueArray =  Arrays.stream(arr).distinct().toArray();

        System.out.println();
        for(int i=0;i<list.size();i++){

        }

    }
}
