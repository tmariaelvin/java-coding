package ModelL2;

import java.util.Scanner;

public class print {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
       int l = st.length(),i,j,n;
        char temp;
        char ch[] = new char[st.length()];
        n=st.length();
        for (i = 0; i < st.length(); i++)
        {
            ch[i] = st.charAt(i);
        }


        for(i=0;i<n/2;i++)
        {

                temp=ch[i];
                ch[i]=ch[n-i+1];
                ch[n-i+1]=temp;
            }
        System.out.println(ch);
}}