package NewTest;

import java.util.Scanner;

public class Kpattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int i,j,x,y;
        x=0;y=n;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(j==1||j==n/2+1-x)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            if(i<=n/2){
                x++;
            }else{
                x--;
            }
            System.out.println();
        }
    }
}
