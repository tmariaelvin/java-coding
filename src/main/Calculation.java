package main;

public class Calculation {
    public static void main(String[] args) {
       /* findMax(new int[]{1,3,4,});*/

    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

}