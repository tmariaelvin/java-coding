package main.latest;

import java.util.Scanner;

public class removedoublicate {

   /*
    public static int[] remove(int a[],int start,int n)
    {
        int i;
        for(i=start+1;i<n;i++)
        {
            a[i-1]=a[i];
        }
        return a;
    }
    public static void main(main.String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
                if (arr[i] == arr[j])
                {
                    System.out.print(" "+arr[i]);
                    remove(arr,j,n);
                    n--;
                }
            }
        }
        System.out.println("print the orginal array");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }*/           ////  Only print the single value in array /////


   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the array size");
       int n = sc.nextInt(),flag=0,k=0;
       int arr[] = new int [n];
       int brr[]= new int [n];
       for(int i=0;i<n;i++)
       {
           arr[i] = sc.nextInt();
       }
       for(int i=0;i<n;i++) {
           if (arr[i] != -1) {
               flag = 0;
               for (int j = i + 1; j < n; j++) {
                   if (arr[i] == arr[j]) {
                       arr[j] = -1;
                       flag = 1;
                   }
               }
               if (flag == 0) {
                   brr[k++] = arr[i];
               }
           }
       }
       System.out.println("print the orginal array");
       for(int i=0;i<k;i++)
       {
           System.out.print(" "+brr[i]);
       }
       }

}
