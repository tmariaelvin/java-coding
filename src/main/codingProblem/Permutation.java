package main.codingProblem;


import java.util.Scanner;

    public class Permutation {

        public static String swapstring(String str, int i, int j){
            char ch[]=str.toCharArray();
            char c;
            c=ch[i];
            ch[i]=ch[j];
            ch[j]=c;
            return String.valueOf(ch);
        }



        public static void genaratePermutation(String str,int start,int end)
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
                    genaratePermutation(str,start+1,end);
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
            genaratePermutation(str,0,l);

        }
    }
