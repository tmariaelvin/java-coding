package practice;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> cache = new HashMap<>();
        cache.put(0, 1);
        int count = 0;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            int diff = sum - k;
            if (cache.containsKey(diff)) {
                count += cache.get(diff);
            }
            cache.put(sum, cache.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k =2;
        Solution s = new Solution();

        System.out.println(s.subarraySum(nums, k));
    }
}
