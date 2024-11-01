package practice;

import java.util.Scanner;

public class SpecialNumber {

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to calculate the sum of digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    // Method to reduce a number to a single digit by summing its digits
    public static int reduceToSingleDigit(int number) {
        while (number >= 10) {
            number = sumOfDigits(number);  // Keep reducing until the sum is a single digit
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 1: Calculate the sum of the digits
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits: " + sum);

        // Step 2: Reduce the sum to a single-digit number
        int singleDigit = reduceToSingleDigit(sum);
        System.out.println("Single-digit sum: " + singleDigit);

        // Step 3: Calculate the factorial of the single-digit number
        int fact = factorial(singleDigit);
        System.out.println("Factorial of " + singleDigit + " is: " + fact);
        System.out.println(trailingZeroes(fact));

        scanner.close();
    }
    public static int trailingZeroes(int n) {
        int fives = 0;
        for (int i = 5; i <= n; i *= 5) {
            fives += n / i;
        }
        return fives;
    }
}
