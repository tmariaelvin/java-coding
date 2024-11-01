package main.letcode;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.println("Enter operation (e.g., '8 / 2'):");
            String input = sc.nextLine();
            String[] value = input.split(" ");

            // Check if input length is valid
            if (value.length != 3) {
                throw new IllegalArgumentException("Input must contain exactly 3 parts: operand1 operator operand2");
            }

            // Parse operands
            int A = parseInteger(value[0]);
            int B = parseInteger(value[2]);

            // Get the operator
            String operator = value[1];

            int result = 0;
            switch (operator) {
                case "/":
                    try {
                        result = A / B;
                    } catch (ArithmeticException e) {
                        throw new ArithmeticException("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator. Only '/' is supported.");
            }

            // Print result if no exceptions
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: One or both operands are not valid numbers.");
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            // Always close the scanner to avoid resource leaks
            if (sc != null) {
                sc.close();
                System.out.println("Scanner closed.");
            }
        }
    }

    // Helper method to parse an integer with error handling
    public static int parseInteger(String value) {
        try {
            return Integer.parseInt(value.trim());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Error: '" + value + "' is not a valid number.");
        }
    }
}
