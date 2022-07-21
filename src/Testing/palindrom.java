package Testing;

import java.util.Scanner;
public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i=10, rem,x;
        long sum=0;
        n = sc.nextInt();
        x = n;
        while (n > 0) {
            rem = n % 10;
            sum=(i*sum)+rem;
            n /= 10;
        }
        System.out.println(sum);
        if (sum == x) {
            System.out.println("palindrom" + sum +" ");
        } else {
            System.out.println("not palindrom" + sum +" ");
        }
    }
}


