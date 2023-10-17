package main.latest;

import java.util.Scanner;

public class sumofpair {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int arr[]=new int [n];
        int max=0,sum=0,index=0,end=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        max=arr[0]+arr[1];
        index=0;end=1;
        for(int i=1;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                sum=arr[i]+arr[j];
                if(max<sum)
                {
                    max=sum;
                    index=i;
                    end=j;
                }
            }
        }
        System.out.println(arr[index]+ "+"+arr[end]+" = "+max);
        System.out.println((index+" , "+ end));
    }
}
