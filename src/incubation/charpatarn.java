package incubation;
import java.util.Scanner;
public class charpatarn {

    /*
       input 5
       output:
                A
                A B A
                A B C B A
                A B C D C B A
                A B C D E D C B A
                A B C D C B A
                A B C B A
                A B A
                A


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x=1;
        int m=1,y;
         y=n;
        for (int i = 1; i <=n*2; i++) {
            m=1;
            for (int j = 1; j < x*2; j++) {
                if (j<x) {
                    System.out.printf("%3c", (64 + m));
                    m = m + 1;
                }
                else
                {
                    System.out.printf("%3c",64+m);
                    m=m-1;
                }
            }
            if(i<y)
            {
                x++;
            }else
            {
                x--;
            }
            System.out.println();
        }
    }





    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x=1;
        int m=1,y;
        y=n;
        for (int i = 1; i <=n*2; i++) {
            m=1;
            for (int j = 1; j < x*2; j++) {
                if (j<x) {
                    System.out.printf("%3d", (m));
                    m = m + 1;
                }
                else
                {
                    System.out.printf("%3d",m);
                    m=m-1;
                }
            }
            if(i<y)
            {
                x++;
            }else
            {
                x--;
            }
            System.out.println();
        }
    }

    INPUT : 3
    out put:
              1
              1 2 1
              1 2 3 2 1
              1 2 1
              1


 */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x=1;
        int m=1,y=0,l=0,p=0;
        y=n;
        l=n*2;
        for (int i = 1; i <=l; i++) {

            p=2;
            if(i<=n) {
                m = i;
            }else{   m = l - i;
            }
            for (int j = 1; j < x*2; j++) {
                if (j<=x) {
                    System.out.printf("%3d",m);
                    m = m - 1;
                }
                else
                {
                    System.out.printf("%3d",p);
                    p=p+1;
                }

            }
            if(i<y)
            {
                x++;
            }else
            {
                x--;
            }
            System.out.println();
        }
    }
}
