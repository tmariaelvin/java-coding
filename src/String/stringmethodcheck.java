package String;
import java.lang.String;
import java.util.Scanner;
public class stringmethodcheck {
    public static void prin(String s)
    {
        System.out.println(s);
    }
    public static void print(char ch[],int l)
    {
        for (char c:ch) {
            System.out.print(c+"  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1=new String();
        System.out.printf("%s", s);
        int l=s.length();
        char []ch=new char[l];
        System.out.print(l);
        System.out.print("\nChar CharAt\n");
        for(int i=0;i<l;i++)
        {
            ch[i]=s.charAt(i);
        }
       print(ch,l);
        ch=s.toCharArray();
       print(ch,l);
        s1=s.substring(1,3);
       prin(s1);
        int n=s.indexOf(s1);
        System.out.println(n);
        boolean m=s.equals(s);
        System.out.println(m);

        prin(s.replace('e','z'));
    }
}