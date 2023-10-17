package main.incubation;
import java.util.Scanner;
public class quadraticequation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c,first = 0,second=0,determine,real=0,image=0;
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        determine=(b*b-4*a*c);
        double sqrt=Math.sqrt(determine);
        if(determine>0)
        {
            first=(-b+sqrt)/(2*a);
            second=(-b-sqrt)/(2*a);
            System.out.println("Root of : "+first+" second root of : "+second);
        }
        else if(determine==0)
        {
            System.out.println("Root of : "+(b+sqrt)/(2*a));
        }
        else
        {
            real=(-b)/(2*a);
            image=Math.sqrt(-determine)/(2*a);
            System.out.println("Root of real : "+real+" second root of imagenary : "+image);

        }



    }
}
