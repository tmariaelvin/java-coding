package practice;

public class CharShift {
    public static void main(String[] args) {
        String input = "Cdeb nqxg!@#";
        String output = shiftCharacters(input);
        System.out.println(output);  // Output: abcz love!@#
    }

    public static String shiftCharacters(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                // Shift each letter by 2 positions back in the alphabet
                char shifted = (char) (c - 2);
                // Handle wrap-around for lowercase letters
                if (c >= 'a' && c <= 'z' && shifted < 'a') {
                    shifted = (char) (shifted + 26);
                }
                result.append(shifted);
            } else {
                // Preserve special characters and spaces
                result.append(c);
            }
        }
        return result.toString();
    }
}
