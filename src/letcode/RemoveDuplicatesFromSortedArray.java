package letcode;
// 26th some
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        int k = 0;
        nums[k++] = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k++]= nums[i];
            }
        }
       /* if(nums[nums.length-1] != nums[nums.length-2]){
            nums[k++]= nums[nums.length-1];
        }*/
        for(int i=0;i<k;i++){
            System.out.println(nums[i]);
        }

    }

}
