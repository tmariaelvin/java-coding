package main.letcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] str = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, ArrayList<String>> res = new HashMap<>();

        for (String st : str) {
            char[] chars = st.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!res.containsKey(sortedWord)) {
                res.put(sortedWord, new ArrayList<>());
            }
            res.get(sortedWord).add(st);

        }
        System.out.println(res.values());

    }
}
