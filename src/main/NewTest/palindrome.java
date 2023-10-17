package main.NewTest;

import java.util.Scanner;

public class palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=0,total=1,i=0,m=0,l=0;
        m=n;
        while(n>0){
            rem=n%10;
            total=total*i+rem;
            n/=10;
            i=10;
        }
        if(total==m){
            System.out.println("number is palindrome "+total);

        }else{
            System.out.println("number is not palindrome "+total);
        }
    }
}
