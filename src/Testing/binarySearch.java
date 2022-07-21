package Testing;

import java.util.Scanner;

public class binarySearch {
    public static void main(String args[])
    {
        /*Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[n];
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
                System.out.println("Search number");*/
        int arr[]={1,2,3,4,5};
        int len=arr.length;
        int number=4;
        System.out.println("Search number");

        for(int j=0;j<len;j++) {
            if (arr[j] == number) {
                System.out.print("print the index  : " + j);
            }
        }
    }
}
