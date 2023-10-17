package main.ModelL2;

import java.util.Scanner;

public class ReverseSpacialchar {

    public static void print(char []ch,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(ch[i]);
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int l, i, j,flag=0;
        String st = sc.nextLine();
        l = st.length();
        char temp;
        char ch[] = new char[st.length()];
        for (i = 0; i < st.length(); i++)
        {
            ch[i] = st.charAt(i);
        }
        i=0;j=l-1;
            while( i < l )
            {

            while(j > 0 )
            {
                if (ch[i] >= 'a' && ch[i] <='z')
                {

                    if (ch[j] >= 'a' && ch[j] <= 'z')
                    {
                        temp = ch[i];
                        ch[i] = ch[j];
                        ch[j] = temp;
                        i++;
                        j--;
                        break;
                    }
                    else
                        {
                        j--;
                    }
                }
                else
                    {
                    i++;
                    break;
                }
            }


        }
        print(ch,l);
    }
}

//inout  : 1234 
//out : sdsfjkhdaf