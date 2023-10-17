package main.codingProblem;

import java.util.Arrays;

public class SortingArrayOfStringLength {
    public static void main(String[] args) {
        String input = "This is a beautiful world";
        String[] arr = Arrays.stream(input.split(" ")).toArray(String[]::new);
        /*Arrays.sort(arr, (a, b) -> b.length() - a.length());
        System.out.println(Arrays.toString(arr));*/

        ///iterate method

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].length() < arr[j].length()) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
