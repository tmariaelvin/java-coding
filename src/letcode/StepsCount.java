package letcode;

import java.util.Scanner;

public class StepsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int next = 1;
        int previous = 0;
        for (int i = 0; i < num; i++) {
            sum = previous + next;
            previous = next;
            next = sum;
        }
        System.out.println(sum);
    }
}
