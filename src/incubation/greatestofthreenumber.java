package incubation;
import java.util.Scanner;
public class greatestofthreenumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if((a>b)&&(a>c))
        {
            System.out.println(" a is greatest of three number");
        }
       else if(b>c)
        {
            System.out.println(" b is greatest of three number");
        }
        else
        {
            System.out.println(" c is greatest of three number");
        }
    }

}
