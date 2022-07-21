package codingProblem;

import java.util.HashSet;
import java.util.Set;

public class RemoveDublicate {
    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>() {
        };
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list);
    }

}
