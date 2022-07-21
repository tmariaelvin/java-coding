package latest;

import java.util.Scanner;

public class sumofpairvalue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = 0, sum = 0, index = 0, end = 0,check=0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter sum value");
        sum=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            max=arr[i];
            for(int j=i+1;j<n;j++)
            {
               // max=max+arr[j];
                end=j;
                if(sum>max)
                {
                    max=max+arr[j];

                }
                if(sum<max)
                {
                    max=max-arr[j-1];
                }
                if(sum==max)
                {
                    index=i;
                    end=j;
                    System.out.println(" "+arr[index]+" + "+arr[end]+"  =  "+sum);
                    check=1;
                    max=0;
                    continue;
                }

            }
        }


    }
}
