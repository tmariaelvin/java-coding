package main.incubation;
import java.util.Scanner;
public class naturalnumber {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++) {
            if (i % 2 != 0) {
                sum=sum+i;
                System.out.print(" \t" + i);
            }
        }
        System.out.print(" \n " + sum);
    }
}
