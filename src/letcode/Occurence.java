package letcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurence {
    public static void main(String[] args) {
        String str = new String("GeeksForGeeks");

        int[] charCount = new int[256]; // Assuming ASCII characters

        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

       for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.println((char) i + " " + charCount[i]);
            }
        }
        /*for(char c : str.toCharArray()){
            System.out.print(c);
            System.out.print(charCount[c]);
        }*/


        Map<Character, Integer> charCount1 = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            charCount1.put(c, charCount1.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
