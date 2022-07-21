package ModelL2;

import java.util.Scanner;

public class OddnumberOftime {
    public static int[] remove(int arr[],int start,int n){
        int i;
       // System.out.print(" Delete value  "+arr[start]);
            for(i=start+1;i<n;i++)
            {
                arr[i-1]=arr[i];
            }
//System.out.println();
        return arr;
    }
    public static void print(int a[],int n){
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print(" "+a[i]);
        }
       // System.out.println();
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int i,j,count=1,index=0;
        int n=sc.nextInt();
        int arr[]=new int[n];
            for( i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
         for(i=0;i<n;i++)
         {
             count=1;
             for(j=i+1;j<n;j++)
             {
                 if(arr[i]==arr[j])
                 {
                   count++;
                   remove(arr,j,n);
                   n--;
                 //  print(arr,n);
                 }
             }
             if(count%2==1)
             {
                 System.out.print(" "+arr[i]);
             }
         }
    }
}
