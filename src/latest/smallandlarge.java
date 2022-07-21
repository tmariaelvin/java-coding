package latest;

import java.util.Scanner;

public class smallandlarge
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Array size");
        int n=sc.nextInt(),max=0,min=0;
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        max=0;min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(" "+max);
        System.out.println(" "+min);
    }
}
