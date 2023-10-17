package main.letcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllDublicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,3,1,4};
        int[] res = new int[nums.length+1];
        List<Integer> list = new ArrayList();

        for(int i=0;i<nums.length;i++){
            res[nums[i]]++;
            if(res[nums[i]]>1){
                list.add(nums[i]);
            }
        }
        System.out.println(list.toString());
    }
}
