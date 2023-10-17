package main.incubation;
import java.util.Arrays;
import java.util.Scanner;
public class positiveornegative {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a[], n;
            n = sc.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] > 0) {
                    System.out.println("positive  " +a[i]);
                } else {
                    System.out.println("negative  " +a[i]);
                }
            }

            System.out.println(Arrays.toString(a));
        }
        }
