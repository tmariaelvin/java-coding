package latest;

import java.util.Scanner;

public class substring {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str;
        str=sc.nextLine();
        int n=0,sublen=0;
        int l,temp=0;
        System.out.println("Enter the substring ");
        n=sc.nextInt();
        l=str.length();
        char ch[]=new char[l];
        int m=l/n;
        String sub[]=new String[m];
        if(l%n!=0) {
            System.out.print(" Not divide ");
        }
        else {
            for (int i = 0; i < l; i++) {
                ch[i] = str.charAt(i);
            }
            for (int i = 0; i < l; ) {
                String str1 = str.substring(i, i + n);
                i = i + n;
                sub[temp++] = str1;
            }
            sublen = temp;
            for (int i = 0; i < sublen; i++) {
                System.out.print(" " + sub[i]);
            }
         }
    }
}
