package main.letcode;

import java.util.ArrayList;
import java.util.List;

public class FrequenceSubString {
    /*
     010011101100010011

    The substrings

                 "01",
                 "0011",
                 "10",
                 "1100",
                 "01" and

            input s = 001100011;*/
    public static void main(String[] args) {
        String input = "001100011";

        List<String> result = new ArrayList<>();
        int start = 0;
        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '0') {
                zeroCount++;
            } else if (currentChar == '1') {
                oneCount++;
            }

            if (zeroCount == oneCount && zeroCount != 0) {
                result.add(input.substring(start, i + 1));
                start = i + 1;
                zeroCount = 0;
                oneCount = 0;
            }
        }

        System.out.println(result);
    }
}
