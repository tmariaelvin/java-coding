package simple;
import java.util.Scanner;
public class oddorevenprint {
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            int x,a;
            int n=sc.nextInt();
            while(n>0)
            {
                x=sc.nextInt();
                if(x%2==0)
                {
                    System.out.printf("%d\t",x);
                }
            }
    }
}
