package latest;

import java.util.Scanner;

public class palindrome {
    public static void main(String args[]){
        Scanner sc  =   new Scanner(System.in);
            int number=sc.nextInt();
            int reminder=0,sum=1,m=0,i=0;
            m=number;
            int n=number;
            while(n>0)
            {
              reminder=n%10;
              sum =sum * i + reminder;
              n =n/10;
              i=10;
            }
            if(sum==number)
            {
                System.out.print(" The number is Palindrome  "+number);
            }
            else
            {
                System.out.print(" The number is NotPalindrome  "+number);
            }
    }
}
