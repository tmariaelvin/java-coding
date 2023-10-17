package main.latest;



import java.util.Scanner;

public class missingnumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  array size");
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
              max=arr[i];
            }
        }
        int min=max;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        int brr[]=new int [max],k=0,flag=0;
        for(int i=min;i<=max;i++) {
            flag=0;
            for (int j = 0; j < n; j++) {
                if (i == arr[j]) {
                    flag = 1;
                    break;
                }
            }
            if(flag==0)
            {
                brr[k++]=i;
            }
        }
        for(int i=0;i<k;i++)
        {
            System.out.print(" "+brr[i]);
        }
    }
}
