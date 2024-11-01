package Zoho;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input  = sc.nextInt();
        generateBraceCombinations("", 0, 0, input);

    }
    public static void generateBraceCombinations(String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            System.out.println(current);
            return;
        }

        if (open < max) {
            generateBraceCombinations(current + "{", open + 1, close, max);
        }
        if (close < open) {
            generateBraceCombinations(current + "}", open, close + 1, max);
        }
    }
}
