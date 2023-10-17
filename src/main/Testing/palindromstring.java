package main.Testing;

import java.util.Scanner;

public class palindromstring
{/*
 public static void main(main.String[] args)
    {
        main.String str,str1=" ";
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        //char a[]=str.toCharArray();
        int l=str.length();
        for(int i=l-1;i>=0;i--)
        {
            str1=str1 + str.charAt(i);

        }
        System.out.println(str1);
       if(str.equals(str1))
            System.out.println("palindrom\t\t"+str);
        else
            System.out.println("not palindrome\t\t"+str);
    }
    }
 */
    public static void main(String args[])
    {
        String original, reverse = ""; // Objects of main.String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }
}