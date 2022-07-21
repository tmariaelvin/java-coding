package latest;

import java.util.Scanner;

public class oddOreven {
    public static void main(String args[])
    {

        /*
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the array size");
        int n= sc.nextInt();
        int arr[] =new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(" odd number :");
        for(int i=0;i<n;i++)
        {

            if(i%2==0)
            {
                System.out.println(" "+arr[i]);
            }

        }
        System.out.println(" odd number :");
        for(int i=0;i<n;i++)
        {
            if(i%2!=0)
            {
                System.out.println(" "+arr[i]);
            }
        }  */

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the array size");
        int n= sc.nextInt();
        int arr[] =new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(" odd number :");
        for(int i=0;i<n;i++)
        {

            if(arr[i]%2==0)
            {
                System.out.println(" "+arr[i]);
            }

        }
        System.out.println(" odd number :");
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.println(" "+arr[i]);
            }
        }

    }
}
