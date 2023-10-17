package main.latest;

import java.util.Scanner;

public class factorial {
    static int facto(int n){
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        return facto(n-1)*n;
    }
    public static void main(String arga[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fact=1;
        for(int i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.print(fact);
        System.out.println(facto(number));
    }
}
