package Testing;

import java.util.Scanner;
public class fibonoseries {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int i,j,n1,n2,n3,n;

        System.out.println("enter  the value");

        System.out.println( n=s.nextInt());
        n1=0;n2=1;
        System.out.println(n1+ "\n"+n2);
        for(i=0;i<n;i++)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }
    }
}
