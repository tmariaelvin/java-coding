package ModelL2;

import java.util.Scanner;

public class kthlargeelementnosort {
    public static int[] remove(int a[],int start,int n){
    int i;
    for(i=start+1;i<n;i++)
    {
        a[i-1]=a[i];
    }
    return a;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,j,kth,max=0,index=0,m;
        System.out.print("Enter the Array length : ");
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the kth number : ");
        kth=sc.nextInt();
        m=kth;

        while(kth>0)
        {
            max=0;
            for(i=0;i<n;i++)
            {
               if(max<a[i])
               {
                   max=a[i];
                   index=i;
               }
            }
            if(kth>1) {
               // remove(a, index, n);  //// not using delete method .  currect position show .
                a[index]=-1;
               // n--;
            }
            kth--;
        }
        System.out.println(m+"kth large number is  : "+max+" position in "+index);
    }
}
