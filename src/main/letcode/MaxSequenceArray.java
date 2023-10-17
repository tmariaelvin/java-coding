package main.letcode;

import java.util.ArrayList;
import java.util.List;

/*
 * input = {10,24,10,20,30,40,20,64,80}
 * output = {10,20,30,40}
 *
 * Explain:
 * 1, seq element stored the array
 *  [10,24]
 * [10,20,30,40]
 * [20,64,80]
 * Max sequence
 *
 * */
public class MaxSequenceArray {
    public static void main(String[] args) {
        List<List<Integer>> arrayLists = new ArrayList<>();
        int[] inputArray = new int[]{10, 24, 10, 20, 30, 40, 20, 64, 80};
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < inputArray.length-1; i++) {
            if (inputArray[i] < inputArray[i + 1]) {
                result.add(inputArray[i]);
            } else {
                result.add(inputArray[i]);
                arrayLists.add(result);
                result = new ArrayList<>();
            }
        }
        int index = 0;
        int maxvalue = 0;
        for (int i = 0; i < arrayLists.size(); i++) {
            if (arrayLists.get(i).size() > maxvalue) {
                maxvalue = arrayLists.size();
                index = i;
            }
        }
        // display the value
        System.out.println(arrayLists.get(index));
    }
}

