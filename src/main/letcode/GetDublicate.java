package main.letcode;

import java.util.*;

public class GetDublicate {
    public static void main(String[] args) {
        int[] arrs = new int[]{1, 2, 3, 4, 5, 5, 6};
        int[] res = new int[arrs.length];
        Set<Integer> set = new HashSet<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        set.add(1);
        set.add(1);
        set.add(5);
        set.add(7);
        System.out.println(set.stream().max(Integer::compare));
        for (int i = 0; i < arrs.length; i++) {
            res[arrs[i]]++;
            if (res[arrs[i]] > 1) {
                System.out.println(arrs[i]);
            }
        }
      /*  int res = arrs.length*(arrs.length+1)/2;
        int sum = 0;
        for(int i=0;i<arrs.length;i++){
            sum += arrs[i];
        }
        System.out.println( arrs.length - (res - sum)  );*/
    }
}
