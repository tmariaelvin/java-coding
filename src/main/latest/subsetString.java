package main.latest;

import java.util.Scanner;

public class subsetString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the string");
        String str;
        str=sc.nextLine();
        int l=str.length(),i,j,k=0;
        char ch[]=str.toCharArray();
       // main.String arr[]=new main.String[l*(l+1)/2];
        for( i=1;i<(1<<l);i++)
        {
            for(j=0;j<l;j++)
            {
                if((i&(1<<j))>0)
                {
                    System.out.print(ch[j]+" ");
                }

            }
            System.out.println();
        }
    }
}
