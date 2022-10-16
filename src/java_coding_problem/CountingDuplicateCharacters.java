package java_coding_problem;


import java.util.Scanner;


public class CountingDuplicateCharacters {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String string = sc.nextLine();
        /* for (int k = 0; k < stringLength; k++) {
            charString[k] = string.charAt(k);
        }

        for (int i = 0; i < stringLength; i++) {
            int count = 0;
            for (int j = i + 1; j < stringLength; j++) {
                if (charString[i] == charString[j] && charString[i] != '1') {
                    count++;
                    charString[j] = '1';
                }
            }
            if (count != 0)
                System.out.println(charString[i] + "-->" + ++count);
        }*/

        /*
         * Using Map concept
         * */


    /*    Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < stringLength; i++) {
            charString[i] = string.charAt(i);
            counts.compute(charString[i],(k,v)->(v==null)? 1:++v);
        }

        System.out.println(counts);
        }
        */


    }
}



