package latest;

import java.util.Scanner;

public class permutation {

    public static String swapstring(String str, int i, int j){
        char ch[]=str.toCharArray();
        char c;
        c=ch[i];
        ch[i]=ch[j];
        ch[j]=c;
        return String.valueOf(ch);
    }



    public static void genrateperm(String str,int start,int end)
    {
        if(start==end-1)
        {
            System.out.println(str);
        }
        else
        {
            for(int i=start;i<end;i++)
            {
                str=swapstring(str,start,i);
                genrateperm(str,start+1,end);
                str=swapstring(str,start,i);
            }
        }

    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the string");
        String str;
        str=sc.nextLine();
        int l=str.length(),i,j,k=0;
       // char ch[]=str.toCharArray();
        genrateperm(str,0,l);

    }
}
