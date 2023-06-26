package june2023;

/*
* 1-abc 2-def   3-ghi  4-jkl   5-mno  6-pqr  7-stu  8-vwx 9-yz  0-space
*
* Example => 22333833355  =  elvin
*            11233 = bdh
* FYI: not repeated value ex: aa or bbb
* */

import java.util.*;

// using Map<Integer, Array>
public class BasicsMobileOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, char[]> value = new HashMap<>();
        Map<Integer, Integer> inputValue = new HashMap<>();
        // add key and value
        value.put(1, new char[]{'a', 'b', 'c'});
        value.put(2, new char[]{'d', 'e', 'f'});
        value.put(3, new char[]{'g', 'h', 'i'});
        value.put(4, new char[]{'j', 'k', 'l'});
        value.put(5, new char[]{'m', 'n', 'o'});
        value.put(6, new char[]{'p', 'q', 'r'});
        value.put(7, new char[]{'s', 't', 'u'});
        value.put(8, new char[]{'v', 'w', 'x'});
        value.put(9, new char[]{'y', 'z', '.'});
        value.put(0, new char[]{' '});
        System.out.println("Enter the Input String : ");
        String romanLetter = sc.nextLine();
        Integer[] letters = new Integer[romanLetter.length()];
        for (int i = 0; i < romanLetter.length(); i++) {
            letters[i] = romanLetter.charAt(i)-48;
        }
        for( Integer letter : letters){
            int count =0 ;
            if (inputValue.containsKey(letter)) {
               inputValue.put(letter,inputValue.get(letter) + 1) ;
            }else{
                inputValue.put(letter,++count) ;
            }
        }
        List<Character> result = new ArrayList<>();
        inputValue.forEach((key,values)->{
            result.add(value.get(key)[values-1]);
        });
        for(Character res : result){
            System.out.print(res);
        }

    }
}
