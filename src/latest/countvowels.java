package latest;

import java.util.Scanner;

public class countvowels {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n enter the string");
        String str;
        String str2;
        str=sc.nextLine();
        System.out.println("\n enter the vowels");
        str2=sc.nextLine();
        int l;
        l=str.length();
        int l2;
        l2=str2.length();
        int count=0,constant=0;
        char ch[]=new char[l];
        char ch2[]=new char[l2];
        for(int i=0;i<l;i++)
        {
            ch[i]=str.charAt(i);
        }
        for(int j=0;j<l2;j++)
        {
            ch2[j]=str2.charAt(j);
        }
        for (int i=0;i<l2;i++)
        {
            System.out.print(" "+ch2[i]);
        }
        for(int i=0;i<l;i++) {
            for (int j = 0; j < l2; j++) {
               /* if (ch[i]==ch2[j]) {
                    count++;
                }*/
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            {
                count++;
            }
                else if (ch[i] >= 'a' || ch[i] <= 'z') {
                    constant++;
                }
            }
        }
        System.out.println("vowels count  :  "+count);
        System.out.println("constant count  :  "+constant);
    }
}
