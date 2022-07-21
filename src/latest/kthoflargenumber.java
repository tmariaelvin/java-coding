package latest;

import java.util.Scanner;

public class kthoflargenumber {

    public static int[] remove(int a[],int start,int n)
    {
       // System.out.print(a[start]);
        for(int i=start+1;i<n;i++)
        {
            a[i-1]=a[i];
        }
        return a;
    }

        public static void print(int a[],int n)
        {
            for(int i=0;i<n;i++)
            {
                System.out.print(" "+a[i]);
            }
        }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int k, i, j = 0, max = 0, min = 0;
        int arr[] = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }/*
        System.out.println("ENter the kth value");
        k = sc.nextInt();
        if (k > n) {
            System.out.println("out of size");
        } else {
            while (k > 0) {
                i = 0;
                j = 1;
                int index = 0,minindex=0;
                max = 0;
                min = arr[0];
                while (i < n) {
                    if (arr[i] > max) {
                        max = arr[i];
                        index = i;
                    }
                    i++;
                }

                arr[index] = -1;

                k--;
            }
            System.out.println(" kth number   : " + max);

            */
            System.out.println("ENter the kth value");
             k=sc.nextInt();
            while (k > 0)
            {
                i = 0;
                min =99;
                while (i < n)
                {
                    if (arr[i] < min)
                    {
                        min = arr[i];
                       // System.out.println(" kth number   : " + min);
                        remove(arr,i,n);
                        n--;
                        //print(arr,n);
                    }
                    i++;
                }
                k--;
            }
            System.out.println(" kth number   : " + min);
        }
    }

