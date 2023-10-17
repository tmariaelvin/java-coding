package main.advancelevel;

import java.util.Scanner;

public class doublicatecharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, k = 0,flag=0;
        String s=new String();
        s=sc.nextLine();
        n=s.length();
        char ch[]=new char[n];
        // int b[] = new int[n];
        for (i = 0; i < n; i++) {
            ch[i] = s.charAt(i);
        }
        for (i = 0; i < n; i++) {
            for (j = i+1; j < n; j++) {
                if (ch[i] == ch[j]) {
                    ch[k++] = ch[i];
                    flag=1;//b[k++]=a[i];
                }
            }
        }
        if(flag==0)
        {
            System.out.println(" NO DOUBLICATE VALUE IN THIS ARRAY");
        }
        System.out.println(k+"  DOUBLICATE VALUE IN THIS ARRAY");
        for(i=0;i<k;i++)
        {
            System.out.print(ch[i]);  // b[i];
        }
    }
}

