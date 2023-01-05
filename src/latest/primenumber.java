package latest;

import java.util.Scanner;

public class primenumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int flag = 0;
        System.out.print(" 1" + " 2");
        for (int i = 3; i < number; i++) {
            flag = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(" " + i);
            }
        }
    }
}
