package learn;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


// n = 1 {}
// n=2 {{}}
// n = 3 {{{}}}
//{{{}}}
//{{{}}}
public class Test2 {
  /*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        System.out.println(generateOutput(input));
        scanner.close();
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input :");
        int inputValue = sc.nextInt();

        StringBuffer sB = new StringBuffer();

        for (int i = 0; i < inputValue; i++) {
            sB.append('{');
        }
        for (int i = 0; i < inputValue; i++) {
            sB.append('}');
        }

        String openBraces = String.join("", Collections.nCopies(inputValue,"{"));
        String closeBraces = String.join("", Collections.nCopies(inputValue,"}"));
        System.out.println(openBraces+closeBraces);
       // System.out.println(sB.toString());
    }

    /* public static String generateOutput(int input) {
         // Create a string with 'input' number of '{' characters
         String openingBraces = String.join("", Collections.nCopies(input, "{"));
         // Create a string with 'input' number of '}' characters
         String closingBraces = String.join("", Collections.nCopies(input, "}"));
         // Concatenate the opening and closing braces
         return openingBraces + closingBraces;
     }*/
    public static String generateOutput(int input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input; i++) {
            output.append("{");
        }
        for (int i = 0; i < input; i++) {
            output.append("}");
        }
        return output.toString();
    }
}

// matrix 2*4
// 0 - sea
