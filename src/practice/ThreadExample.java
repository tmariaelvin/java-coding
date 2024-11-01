package practice;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        System.out.println(thread.getState());
        List<Integer> list = Arrays.asList(1,4,3,5,2,4,3);
        Set<Integer> set = new HashSet<>();
        Set<Integer> doublicate = new HashSet<>();




        List<Integer> sortedList = list.stream().sorted((a,b)-> b-a).collect(Collectors.toList());
        List<Integer> sortedList1 = list.stream().sorted(Comparator.reverseOrder()).toList();

        List<Integer> sortedList2 = list.stream().distinct().toList();
        System.out.println(sortedList1);
        System.out.println(sortedList2);

        for(Integer value : list){
            if(!set.add(value)){
                doublicate.add(value);
            }
        }

        System.out.println(doublicate);

        List<Integer> dl = list.stream()
                .collect(Collectors.groupingBy(e-> e,Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(dl);

        List<Integer> list1= Arrays.asList(11,22,33,44,11,22);
        int[] input  = {1,3,4,2,5,2, 3};

        list1.stream().filter(input1 -> Collections.frequency(list1,input1)==1).forEach(System.out::print);



        int[] distinctArray = Arrays.stream(input).distinct().toArray();
        System.out.println(Arrays.toString(distinctArray));
        Arrays.sort(input);
        System.out.println(Arrays.toString(input));

        // duplicate and All value
        Set<Integer> set1 = new HashSet<>();
        Arrays.stream(input).filter(s-> set1.add(s)).forEach(System.out::print);
        System.out.println();

        //min and max in the Array
        System.out.println(Arrays.stream(input).max().getAsInt());
        System.out.println(Arrays.stream(input).min().getAsInt());


        System.out.println(list1.stream().
                filter(x-> Collections.frequency(list1,x)==1).
                collect(Collectors.toList()));

        List<String> list2 = Arrays.asList("abc", "def", "xyz", "mno", "pqr",
                "def", "xyz", "stu");
        Set<String> set2=new LinkedHashSet<>();
        list2.stream().filter(s1->!set2.add(s1)).forEach(System.out::println);

        String s = "string data to count each character";
        Map<String,Long> countMap= Arrays.stream(s.split("")).
                map(String::toLowerCase).
                collect(Collectors.groupingBy(str -> str,
                        LinkedHashMap::new,Collectors.counting()));
        System.out.println(countMap);

       // collect(Collectors.groupingBy(str,LinkHashMap::new,Collectors.counting()));


    }
}
