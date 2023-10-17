package main.latest;

import java.util.Scanner;

public class frquenceofarrayelement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(),j=0,count=1,i=0,k=0,max=0,inde=0,l=0;
        int value=0;
        int arr[]=new int [n];
        int arr1[]=new int [n];
        for( i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       for(i=0;i<n;i++){
            if(arr[i]==-1) {
                continue;
                }
            else
                {
                for (j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = -1;
                       // value=i;
                        arr1[i]=count;
                    }
                }
            }
            arr1[i]=count;
            //k++;
            System.out.println(arr[i]+" --- "+count);
            count=1;
        }
       int start=0;int brr[]=new int [n];
                k=0;
       for(  l=0;l<n;l++) {
           if (arr1[l] != 0) {
                   System.out.print(arr1[l]);
                   brr[k++]=arr1[l];
               }
           }
       for(i=0;i<k;i++)
       {
           for(j=i+1;j<k;j++)
           {

               if(brr[i]<brr[j])
               {
                  int temp= brr[j];
                  brr[j]=brr[i];
                  brr[i]=temp;
               }
           }
       }
       System.out.println("Sorted value\n");
       for(i=0;i<k;i++)
       {
           System.out.print(" \t"+brr[i]);
       }
       int flag=0;
       System.out.println("\n");
       for(i=0;i<k;i++){
           flag=0;
           for (j = 0; j < n; j++) {
               if (brr[i] == arr1[j]) {
                   for (int p = 0; p < brr[i]; p++) {
                       System.out.print("\t " + arr[j]);
                   }
                   arr1[j]=-1;
                   flag=1;
                   //continue;
               }

           }

       }
          // System.out.println(max);


    }
}
