package NewTest;

import java.util.Scanner;

public class ArraySortFrequency {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int arr[]=new int[n];
        //int b[]={};
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
          //  b[i]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
