package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {

        List<Integer> lists = Arrays.asList(1,3,4,5,2,4);

        //lists.stream().distinct();

        Set<Integer> result = new HashSet<>();

        for(int i=0;i<lists.size();i++){
            result.add(lists.get(i));
        }
        System.out.println(result);


    }
}
