package main.incubation;
import java.util.Scanner;
public class patarnhalfofdiamond {
  /*
    intput : 5
    output  :
               *
               * *
               * * *
               * * * *
               * * * * *
                        * * * * *
                        * * * *
                        * * *
                        * *
                        *
*/
    public static void prin() {

        Scanner sc = new Scanner(System.in);
        int n, j, i, x, y;
        n = sc.nextInt();
        y=n*2;
        x = n * 2;
        for (i = 1; i <= y;i++) {
            for (j = 1; j<= x;j++) {
             if(i<=n&&j<=i)
             {
                 System.out.print("*");
             }
             else if(i>n&&j>=i)
             {
                 System.out.print("*");
             }
                else if(i>n&&j<n)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
                  /*           .//// input : 5
                                  ooutput:

                                  *
                                  * *
                                  * * *
                                  * * * *
                                  * * * * *
                                          * * * * *
                                            * * * *
                                              * * *
                                                * *
                                                  *

*/
  public static void print() {

      Scanner sc = new Scanner(System.in);
      int n, j, i, x, y;
      n = sc.nextInt();
      y=n*2;
      x = n * 2;
      for (i = 1; i <= y;i++) {
          for (j = 1; j<= x;j++) {
              if(i<=n&&j<=i)
              {
                  System.out.print("*");
              }
              else if(i>n&&j>=i)
              {
                  System.out.print("*");
              }
              else
              {
                  System.out.print(" ");
              }
          }
          System.out.println();
      }
  }







    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, j, i, x, y;
        n = sc.nextInt();
        y=n*2;
        x = n * 2;
        for (i = 1; i <= y*2;i=i+2) {
            for (j = 1; j<= x*2;j++) {
                if(i<=n*2&&j<=i)
                {
                    System.out.print("*");
                }
                else if(i>n*2&&j>i)
                {
                    System.out.print("*");
                }
                else if(i>n*2&&j<n*2)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println(" enter the value");
        print();
        System.out.println(" enter the value");
       prin();
        //pri();
    }






}
