package main.L2;

import java.util.Scanner;

public class Code4 {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        System.out.println("enter the Sum Value");
        int value = sc.nextInt();


        int[] arr =new int [n];
        int sum,index,end;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                sum=arr[i]+arr[j];
                if(value == sum)
                {
                    index=i;
                    end=j;
                    System.out.println(arr[index]+ "+"+arr[end]+" = "+value);
                    break;
                }
            }
        }

    }
}
