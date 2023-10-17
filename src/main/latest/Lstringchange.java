package main.latest;

import java.util.Scanner;

public class Lstringchange {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        String str;
        str=sc.nextLine();
        int l=str.length();
        int j = l - 1;
        char ch[]=str.toCharArray();
        int i=0;
        while(i<l/2) {
            if (ch[i] >= 'a' && ch[i] <= 'z' || ch[i]>='A' && ch[i]<='Z') {

                while (j > l/2) {
                    if (ch[j] >= 'a' && ch[j] <= 'z'  ||  ch[j]>='A' && ch[j]<='Z') {
                        char temp = ch[j];
                        ch[j] = ch[i];
                        ch[i] = temp;
                        j--;
                        break;
                    }
                    else {
                        j--;
                    }
                }
                i++;
            }
            else
                {
                i++;
            }
        }
        for( i=0;i<l;i++)
        {
            System.out.print(ch[i]);
        }
    }

}
