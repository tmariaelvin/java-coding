package main.Array;
import java.util.Scanner;
public class sortArray {

    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int[][]a=new int[n][m];
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<m;j++)
          {
              a[i][j]=sc.nextInt();
              System.out.print(a[i][j]+"\t");
          }
          System.out.print("\n");
      }
    }

}
