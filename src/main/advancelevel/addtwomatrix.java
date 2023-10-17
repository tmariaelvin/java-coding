package main.advancelevel;
import java.util.Scanner;
public class addtwomatrix {
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("ENTER THE ROWS AND COLS");
             int row,col,i,j;
             row=sc.nextInt();
             col=sc.nextInt();

             if(row==col)
             {
                 int a[][]=new int[row][col];
                 int b[][]=new int[row][col];
                 int c[][]=new int[row][col];
                 for(i=0;i<row;i++)
                 {
                     for(j=0;j<col;j++) {
                     a[i][j]=sc.nextInt();
                     b[i][j]=sc.nextInt();
                     }
                     }
                 for(i=0;i<row;i++)
                 {
                     for(j=0;j<col;j++)
                     {
                         c[i][j]=a[i][j]+b[i][j];
                     }
                 }

                 for(i=0;i<row;i++)
                 {
                     for(j=0;j<col;j++)
                     {
                         System.out.print(c[i][j]);
                     }
                     System.out.println();
                 }

             }
             else
             { System.out.println(" NOT FOUND THIS METHOD");
             }

    }
}
