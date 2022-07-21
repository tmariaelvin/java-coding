package NewTest;

import java.util.Scanner;

public class Arrayfrequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENter the array lenght");
        int n = sc.nextInt(), count = 0, freq = -1;
        int arr[] = new int[n], fre[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            fre[i] = arr[i];
        }
        for (int i : fre)
            System.out.print(i);
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (fre[i] != freq) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == fre[j]) {
                        count++;
                        fre[j] = freq;
                    }
                }
            fre[i] = count;
            System.out.println("  " + arr[i] + "------ " + fre[i]);
            count = 0;


        }
    }
    }
}
