package learn;

import java.util.Scanner;

public class Test1 {

    // inputA : elvin
    // inputB : Win

    // add w or replace v to W
    // e and l remove

    public static void main(String[] args) {
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

    }

}
