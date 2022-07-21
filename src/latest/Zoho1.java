package latest;

import java.util.Scanner;

public class Zoho1 {

          public static void main(String args[])
          {
              Scanner sc=new Scanner(System.in);
                  int n=sc.nextInt();
              int arr[]=new int[n];
              int brr[]=new int[n];
              int count=0,index=0;
              for(int i=0;i<n;i++)
              {
                  arr[i]=sc.nextInt();
              }
              for(int j=0;j<n;j++) {
                  count=0;
                  for (int k = 1; k <= arr[j]; k++) {
                      if (arr[j]%k==0)
                      {
                          count++;
                      }
                  }
                  brr[index++]=count;
              }
              int max=0,value=0;
              for(int i=0;i<n;i++)
              {

                  for(int j=0;j<index;j++)
                  {
                      if(brr[j]>max) {
                          max = brr[j];
                          value=j;
                      }
                  }
                  System.out.print(arr[value+1]);
                  value =0;
              }
          }
}
