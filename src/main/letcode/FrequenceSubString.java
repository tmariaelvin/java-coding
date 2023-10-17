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
        "0011" have equal numbers of 0s and 1s with all 0s and 1s grouped consecutively.
            input s = 001100011;*/
    public static void main(String[] args) {
        String input  = "001100011";

        List<String> result = new ArrayList<>();
        int start = 0;
        int zeroCount = 0;
        int oneCount = 0;
        for(int i=0;i<input.length();i++){
            input.charAt(i);
            System.out.println(input.charAt(i));
            if(input.charAt(i) == '0'){
                zeroCount++;
            }
            if(input.charAt(i) == '1'){
                oneCount++;
            }
            if(zeroCount == oneCount){
                result.add(input.substring(start,i+1));
                start =i+1;
                zeroCount--;
                oneCount--;
            }
        }
        System.out.println(result.toString());
    }
}
