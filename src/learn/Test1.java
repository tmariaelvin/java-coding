package learn;

import java.util.Scanner;

public class Test1 {

    // inputA : elvin
    // inputB : Win

    // add w or replace v to W
    // e and l remove

   /* public static void main(String[] args) {
        StringBuffer res = new StringBuffer();
        System.out.println("Enter the input values");
        Scanner sc = new Scanner(System.in);
        String inputA = sc.nextLine();
        String inputB = sc.nextLine();
        StringBuffer inputSA = new StringBuffer(inputA);
        StringBuffer inputSB = new StringBuffer(inputB);
        int result = 0;
        int avalablity = 0;

        int k = 0;
        //find the missing characters
        while (k < inputSB.length()) {
            boolean isAvailable = false;
            for (int i = 0; i < inputSA.length()-1; i++) {
                if (inputSB.charAt(k) == inputSA.charAt(i)) {
                    isAvailable = true;
                    break;
                }
            }
            if (!isAvailable) {
                result++;
            } else {
                avalablity++;
            }
            k++;
        }
        int cal = inputSB.length() - avalablity;
        int cal1 =0;
        if(cal == 0){
            cal1 = inputSA.length() - avalablity+1;
        }
       else{
           cal1 = inputSA.length() - avalablity-1;
        }
        result = cal1;

        System.out.println(result);

    }*/


    public static void main(String[] args) {
        System.out.println("Enter the input values");
        Scanner sc = new Scanner(System.in);
        String inputA = sc.nextLine();
        String inputB = sc.nextLine();
        sc.close();

        int result = calculateEditDistance(inputA, inputB);
        System.out.println("Minimum edit distance: " + result);
    }

    public static int calculateEditDistance(String inputA, String inputB) {
        int m = inputA.length();
        int n = inputB.length();

        // Create a memoization array to store results of subproblems
        int[][] memo = new int[m + 1][n + 1];

        // Initialize the memoization array with -1
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                memo[i][j] = -1;
            }
        }

        return editDistanceHelper(inputA, inputB, m, n, memo);
    }

    public static int editDistanceHelper(String inputA, String inputB, int m, int n, int[][] memo) {
        // If one of the strings is empty
        if (m == 0) {
            return n; // Insert all characters of inputB
        }
        if (n == 0) {
            return m; // Delete all characters of inputA
        }

        // Check if the result is already computed
        if (memo[m][n] != -1) {
            return memo[m][n];
        }

        // If last characters are the same, ignore them and recur for the remaining strings
        if (inputA.charAt(m - 1) == inputB.charAt(n - 1)) {
            memo[m][n] = editDistanceHelper(inputA, inputB, m - 1, n - 1, memo);
        } else {
            // Consider all three operations and choose the one with minimum cost
            int insertOp = editDistanceHelper(inputA, inputB, m, n - 1, memo);
            int deleteOp = editDistanceHelper(inputA, inputB, m - 1, n, memo);
            int replaceOp = editDistanceHelper(inputA, inputB, m - 1, n - 1, memo);
            memo[m][n] = 1 + Math.min(insertOp, Math.min(deleteOp, replaceOp));
        }

        return memo[m][n];
    }

}


//

/*
public static int calculateEditDistance(String inputA, String inputB) {
    int m = inputA.length();
    int n = inputB.length();

    // Create a 2D array to store the edit distances
    int[][] dp = new int[m + 1][n + 1];

    // Initialize the base cases
    for (int i = 0; i <= m; i++) {
        dp[i][0] = i; // Cost of deleting all characters from inputA
    }
    for (int j = 0; j <= n; j++) {
        dp[0][j] = j; // Cost of inserting all characters to inputA to make inputB
    }

    // Fill the dp array
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (inputA.charAt(i - 1) == inputB.charAt(j - 1)) {
                dp[i][j] = dp[i - 1][j - 1]; // Characters match, no extra cost
            } else {
                dp[i][j] = Math.min(dp[i - 1][j - 1], // Substitution
                        Math.min(dp[i - 1][j],    // Deletion
                                dp[i][j - 1])    // Insertion
                ) + 1;
            }
        }
    }

    return dp[m][n];
}*/
