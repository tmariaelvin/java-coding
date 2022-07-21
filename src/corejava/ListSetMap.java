package corejava;

import java.util.*;

public class ListSetMap {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<>();

        al.add("mango");
        al.add("orange");
        al.add("Grapes");
        al.add("mango");
        al.add("mango");

        System.out.println(al);


        // Set demonstration using HashSet
        Set<String> Set =new HashSet<>();


        Set.add("one");
        Set.add("two");
        Set.add("three");
        Set.add("four");
        Set.add("five");
        Set.add("one");
        Set.add("two");

        System.out.println(Set);





        Map<Integer, String> map
                = new HashMap<Integer, String>();

        // Adding Elements using Map.
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        map.put(101, "Vijay");
        // Elements can traverse in any order
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " "
                    + m.getValue());
        }



    }
}
