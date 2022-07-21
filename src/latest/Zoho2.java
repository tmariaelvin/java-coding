package latest;

import java.util.Scanner;

public class Zoho2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            System.out.printf(" "+ch[i]);
        }
    }
}
