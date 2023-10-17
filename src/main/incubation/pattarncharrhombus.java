package main.incubation;
import java.util.Scanner;
public class pattarncharrhombus {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,x=1;
        int n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            for(j=1;j<=x;j++)
            {
                System.out.printf("%3c",64+j);
                if(i<=n/2)
                {
                    x++;
                }
                else
                {
                    x--;
                }
            }
            System.out.println();
        }
    }
}
