package main.letcode;

public class MajorElement {
    public static void main(String[] args) {
        int[] nums = new int[]{1,4,3,4,2,2,4};
        int major = 0, count = 0;
        for(int num : nums){
            if(count == 0){
                major = num;
                count++;
            }
            else if(major == num) count++;
            else count--;
        }
        System.out.println(major);
    }
}
