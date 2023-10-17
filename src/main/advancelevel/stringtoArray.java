package main.advancelevel;
import java.util.Scanner;
public class stringtoArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        String str=new String();
        str=sc.nextLine();
        n=str.length();
       //StringBuffer sb=new StringBuffer();
        String str1[];
        str1=str.split("\\s");
        for(i=0;i<str1.length;i++)
        {
            System.out.print(str1[i]+" ");
            //sb.append(str1[i]);
        }
        int m=str1.length;
       System.out.println();
        // main.String s=sb.toString();
       // System.out.println(s);
        for(i=0;i<str1.length/2;i++)
        {
            String temp=str1[i];
            str1[i]=str1[m-i-1];
            str1[m-i-1]=temp;
        }
        for(i=0;i<m;i++)
        {
            System.out.print(str1[i]+" ");
        }
    }
}
