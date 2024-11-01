package practice;

import java.util.Arrays;

import static java.util.Collections.swap;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;


        System.out.println(Arrays.toString(nums));

        //single array
        rotate1(nums, k);

        //using extra space
        //rotate(nums, k);
        System.out.println(Arrays.toString(nums));  // Output: [5, 6, 7, 1, 2, 3, 4]
    }

    public static void rotate1(int[] nums, int k) {
        k=k%nums.length;
        swapArray(nums,0, nums.length - 1);
        swapArray(nums, 0,k-1);
        swapArray(nums, k, nums.length - 1);
    }

    public static void swapArray(int[] nums, int start, int end) {

        while (start< end) {
            int temp = nums[start];
            nums[start ] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // Handle the case where k is greater than the array size

        int[] rotated = new int[n];

        // Step 1: Place each element in its rotated position
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }

        // Step 2: Copy the rotated array back to the original array
        for (int i = 0; i < n; i++) {
            nums[i] = rotated[i];
        }
    }
}
