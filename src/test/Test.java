package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class X {
    public void mX() {
        System.out.println("Xm1");
    }
}

class Y extends X {
    public void mX() {
        System.out.println("Xm2");
    }
    public void mY() {
        System.out.println("Ym");
    }
}

public class Test {
    public static void main(String[] args) {
        X xRef = new Y();
        Y yRef = (Y) xRef;
        yRef.mY();
        xRef.mX();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Find odd numbers using stream
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0).map((m)-> m+2 ).sorted().toList();

    }
}
