package practice;

public class FindSecondLargestValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 9, 8, 13, 4};
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second_max = max;
                max = arr[i];
            } else if (arr[i] > second_max && max > arr[i]) {
                second_max = arr[i];
            }
        }
        System.out.println(second_max);
    }
}
