package main.latest;

import java.util.Scanner;

public class rotatearray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size ");
        int n = sc.nextInt(),j=1;
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the kth time rotate");
        int k=sc.nextInt();
     /*   if(k>n)
        {
            System.out.println(" enter the kth value out of array size");
        }   */
        while(k>0)
        {
            j=1;
            while(j<n)
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j++;
            }
            k--;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
