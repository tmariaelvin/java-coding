package main.letcode;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
       Integer[] array = {1,2,3,4,5,2,3,1,4,5};
       Map<Integer, Integer> map = new HashMap<>();
       map.put(1,1);
       map.getOrDefault(1,0);

       for(Integer res: map.keySet()){
           System.out.print(map.get(res));
       }

       Set<Integer> set = new HashSet<>(Arrays.asList(array));

        System.out.println(set);
    }
}
