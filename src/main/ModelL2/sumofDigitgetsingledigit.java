package main.ModelL2;

import java.util.Scanner;

public class sumofDigitgetsingledigit {
    public static int checkcount(int n){
        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, k, count, sum = 0, rem, lenght = 0;
        n = sc.nextInt();
        lenght = checkcount(n);
       // System.out.println(" " + lenght);
        while (lenght > 1) {
            sum=0;
            while (n > 0) {
                rem = n % 10;
                sum = sum + rem;
                n = n / 10;
                //System.out.print(" "+sum+" + ");
            }

            //System.out.print(" = "+sum+"\n");
            lenght = checkcount(sum);
           // System.out.println("next length "+lenght);
            n=sum;
        }
        System.out.println("Finally :  "+n);
    }
}
