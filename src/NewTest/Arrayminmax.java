package NewTest;

import java.util.Scanner;

public class Arrayminmax {
    public static int min(int arr[],int n){
        int mi,ma;
        mi=arr[0];ma=arr[0];
        for(int i=1;i<n;i++)
        {
    if(arr[i]<mi){
        mi=arr[i];
    }
    if(arr[i]>ma){
        ma=arr[i];
    }
        }
        System.out.println("minmum number in array"+mi);
        System.out.println("maxmum number in array"+ma);
        return 0;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array lenght");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        min(arr,n);
    }
}
