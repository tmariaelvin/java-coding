package Zoho;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string inputA: ");
        String inputA = sc.nextLine();
        System.out.println("Enter the string inputB: ");
        String inputB = sc.nextLine();
        int inputALength = inputA.length();
        int inputBLength = inputB.length();
        int[][] leastIter = new int[inputALength + 1][inputBLength + 1];

        for (int i = 0; i <= inputALength; i++) {
            leastIter[i][0] = i;
        }
        for (int j = 0; j <= inputBLength; j++) {
            leastIter[0][j] = j;
        }

        for (int i = 1; i <= inputALength; i++) {
            for (int j = 1; j <= inputBLength; j++) {
                if (inputA.charAt(i - 1) == inputB.charAt(j - 1)) {
                    leastIter[i][j] = leastIter[i - 1][j - 1];
                } else {
                    leastIter[i][j] = Math.min(leastIter[i - 1][j - 1],
                            Math.min(leastIter[i - 1][j], leastIter[i - 1][j])
                    ) + 1;
                }
            }
        }

        System.out.println(leastIter[inputALength][inputBLength]);


    }
}


// inputA string : cinnamon
//inputB string:  niaom
// output = 5
