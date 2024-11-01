package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SequenceOfStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,4,3,6,7);

       Stream<Integer> re =  numbers.stream().filter((num)-> num>3)
                .peek((n)-> System.out.println(n)).map((n)->n*2).peek((m)-> System.out.println(m));
        re.collect(Collectors.toList());
    }

}
