package learn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String str = scanner.nextLine();

        System.out.println("Output: " + StringExpression(str));
    }

    public static String StringExpression(String str) {
        int length = str.length();
        int result = 0;
        int currentNumber = 0;
        boolean isNegative = false;

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);

            if (Character.isDigit(currentChar)) {
                currentNumber = currentNumber * 10 + Character.getNumericValue(currentChar);
            } else if (currentChar == 'm') {
                isNegative = true;
            } else if (currentChar == 'p') {
                isNegative = false;
            } else {
                result = isNegative ? result - currentNumber : result + currentNumber;
                currentNumber = 0;
            }
        }

        result += isNegative ? -currentNumber : currentNumber;

        String resultStr = (result < 0) ? "negative" : "";
        resultStr += convertToWord(Math.abs(result));

        return resultStr;
    }

    public static String convertToWord(int number) {
        String[] words = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };

        if (number < 10) {
            return words[number];
        }

        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int digit = number % 10;
            result.insert(0, words[digit]);
            number /= 10;
        }

        return result.toString();
    }
}
