package june2023;

/*
I-1
V-5
X-10
L-50
Example = VIII => 5 + 1 + 1 + 1 = 8
           IX => -1 + 10 = 9
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Using map<character, Integer>;
public class RomanLeterToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> inputValue = new HashMap<>();
        Integer result = 0;
        //set the key and value in map
        inputValue.put('I', 1);
        inputValue.put('V', 5);
        inputValue.put('X', 10);
        inputValue.put('L', 50);
        System.out.println("Enter the Input String : ");
        String romanLetter = sc.nextLine();
        Character[] letter = new Character[romanLetter.length()];
        // convert string to Character array
        for (int i = 0; i < romanLetter.length(); i++) {
            letter[i] = romanLetter.charAt(i);
        }
        if (letter.length == 1) {
            result += inputValue.get(letter[0]);
            System.out.println(result);
            return;
        }
        for (int i = 0; i < letter.length; i++) {
            if (i < letter.length-1 && inputValue.get(letter[i]) < inputValue.get(letter[i+1])) {
                result -= inputValue.get(letter[i]);
            }else{
                result += inputValue.get(letter[i]);
            }
        }
        System.out.println(result);

    }
}

/*class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> inputValue = new HashMap<>();
        //set the key and value in map
        inputValue.put('I', 1);
        inputValue.put('V', 5);
        inputValue.put('X', 10);
        inputValue.put('L', 50);
        inputValue.put('C', 100);
        inputValue.put('D', 500);
        inputValue.put('M', 1000);


         Integer result = 0;

        if (s.length() == 1) {
            result += inputValue.get(s.charAt(0));
            return result;
        }
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length()-1 && inputValue.get(s.charAt(i)) <   inputValue.get(s.charAt(i+1))) {
                result -= inputValue.get(s.charAt(i));
            }else{
                result += inputValue.get(s.charAt(i));
            }
        }
        return result;
    }
}*/