package letcode;

public class MajorElement {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,1,1,4,4,5,5,4};
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
