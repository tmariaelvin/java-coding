package incubation;
import java.util.Scanner;
public class patarentriangle {

   /*
   input : 5
   output:

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i>=j)
                System.out.print(j);
            }
            System.out.println();
        }
        }

         input : 5
         output
                1
                2 2
                3 3 3
                4 4 4 4
                5 5 5 5 5


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i>=j)
                    System.out.print(i);
            }
            System.out.println();
        }
    }
            input   : 4

            output

            1
            2 3
            4 5 6
            7 8 9 10




    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i>=j)
                    System.out.print(x+++" ");
            }
            System.out.println();
        }
    }

    /////      pyramid   /////

              1 1 1 1 1
               2 2 2 2
                3 3 3
                 4 4
                  5


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2!=0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if(i<=j)
                        System.out.print(i);
                        System.out.print(" ");
                        //System.out.print(" ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("not found is only odd number ");
        }
    }
    /////      pyramid   /////

                   5
                  4 4
                 3 3 3
                2 2 2 2
               1 1 1 1 1
  */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x, y, k = 0;
        x = n ;
        y = n ;
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n*2; j++)
                {
                    if (j >= x && j <= y) {

                        System.out.print(i);
                    }
                    else{
                            System.out.print(" ");
                        }//System.out.print(" ");

                }
                    x--;
                    y++;
                    System.out.println();

            }
        }

        else
                {
                    System.out.println("not found is only odd number ");
                }

    }
}