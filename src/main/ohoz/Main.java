package main.ohoz;

public class Main {
    public static void main(String[] args) {
        String input1 = "abbaab";
        String substring1 = "ab";
        boolean containsSubstring1 = containsSubstring(input1, substring1);
        System.out.println("Input1 contains the substring: " + containsSubstring1);

        String input2 = "abccba";
        String substring2 = "abc";
        boolean containsSubstring2 = containsSubstring(input2, substring2);
        System.out.println("Input2 contains the substring: " + containsSubstring2);

        String input3 = "acdacd";
        String substring3 = "acd";
        boolean containsSubstring3 = containsSubstring(input3, substring3);
        System.out.println("Input3 contains the substring: " + containsSubstring3);

        String input4 = "acdfacd";
        String substring4 = "acd";
        boolean containsSubstring4 = containsSubstring(input4, substring4);
        System.out.println("Input4 contains the substring: " + containsSubstring4);
    }

    public static boolean containsSubstring(String input, String substring) {
        int inputLength = input.length();
        int substringLength = substring.length();

        int inputIndex = 0;
        int substringIndex = 0;

        while (inputIndex < inputLength) {
            if (input.charAt(inputIndex) == substring.charAt(substringIndex)) {
                substringIndex++;
                if (substringIndex == substringLength) {
                    return true;
                }
            }
            inputIndex++;
        }

        return false;
    }
}
