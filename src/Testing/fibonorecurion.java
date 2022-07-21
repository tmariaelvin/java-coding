package Testing;

import java.util.Scanner;
public class fibonorecurion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        n = sc.nextInt();
        System.out.println(n);
        fibno(n,0,1,0);
    }

    public static int fibno(int n,int n1,int n2,int n3)
    {
              if(n==0)
              {
                  return 1;
              }
              else
              {
                  n3=n1+n2;
                   n1=n2;
                   n2=n3;
                   System.out.println(n3);
              }
              return fibno(n-1,n1,n2,n3);    }
}

