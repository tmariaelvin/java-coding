package latest;

import java.util.Scanner;

/*
sample input :
Enter the number
        123
        number is not armstrong  123*/


public class armstrong {
    public static int power(int rem,int digit)
    {
        if(digit==0)
        {
            return 0;
        }
        if(digit==1)
        {
            return rem;
        }
        return power(rem,digit-1)*rem;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int sum = 0,reminder = 0, orginal = 0, i = 1, digit = 0;
        orginal=number;
        int n = number;
        while (number > 0)
        {
        number=number/10;
            digit++;
        }

        while(n>0)
        {
            reminder=n%10;
            sum=sum+power(reminder,digit);
            n=n/10;
        }
        if(sum==orginal)
        {
            System.out.println("Number is armstrong  "+sum);
        }
        else
        {
            System.out.println(" number is not armstrong  "+orginal);
        }
    }
}
