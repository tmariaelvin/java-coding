package main;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map<Integer, Integer> input = new HashMap<>();
        input.put(1,2);
        input.put(2,4);
       /* for(Integer result : input.getkey()){
            System.out.print(map.get(result))
        }*/
        for(Map.Entry<Integer, Integer> res : input.entrySet() ){
            System.out.print(res);
        }


    }
}
