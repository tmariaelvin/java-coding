package NewTest;

import java.util.Scanner;

public class Numberpattern {
    static int prime(int n){
        int x,flag=0;
        x=n;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            return n;
        }
        else{
            return prime(n+1);
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,y,x;
        x=0;y=2;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                x=prime(y);
                System.out.printf("%5d  ",+x);
                y=x+1;
            }

            System.out.println();
        }
    }
}
