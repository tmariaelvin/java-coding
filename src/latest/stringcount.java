package latest;

import java.util.Scanner;

public class stringcount {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String ");
        String str;
        str=sc.nextLine();
        int len=str.length();
        char ch[]=new char[len];
        int count=0;
        for(int i=0;i<len-1;i++)
        {
            ch[i]=str.charAt(i);
            count++;
        }
        System.out.print(" "+count);
        for(int i=0;i<len-1;i++)
        {
            System.out.print(" "+ch[i]);
        }
    }
}
