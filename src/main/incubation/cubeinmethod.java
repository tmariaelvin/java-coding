package main.incubation;
import java.util.Scanner;
public class cubeinmethod {


//    CUBE OF THE NUMBER UP TO GIVEN NUMBER//
  /*  public static int cube(int y,int x)
    {
        if(x==0)
        {
            return 0;
        }
        if(x==1)
        {
            return y;
        }
        return y*cube(y,x-1);
    }
    public static void main(main.String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int x=3;
        for(int i=1;i<=n;i++) {
            sum = cube(i, x);
            System.out.println(sum);
        }
    }*/

    // MULTIPLICATION TABLE//


    public static int table(int x, int y) {
        if (y == 0) {
            return 0;
        }
        if (y == 1) {
            return y;
        }
        return x * table(x, y - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int x = 3;
        for (int i = 0; i <= n; i++) {
            //sum = table(x, i);
            for (i = 0; i <= n; i++) {
                sum=x*i;
                System.out.printf("  %d *  %d  = %d \n", x, i, sum);
            }
        }
    }
}
