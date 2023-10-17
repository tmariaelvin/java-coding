package main.ModelL2;



import java.util.Scanner;

public class continuenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, count = 0,j,k,flag=0;
        int x;
        n = sc.nextInt();
        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max=0;
        for (i = 0; i < n; i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println(" "+max);
         i=0;j=0;k=0;
        while(i<n)
        {
            k=a[i];
            flag=0;
            while(k<=max)
            {
                j=0;
                while(j<n) {
                    if (a[i] == max) {
                        System.out.println(" " + a[i] + "---> " + 0);
                        flag = 1;
                        break;
                    }
                    if (k + 1 == a[j]) {
                        System.out.println(" " + a[i] + "---> " + a[j]);
                        flag = 1;
                        break;
                    }
                    j++;
                }
                    if(flag==1)
                    {
                        break;
                    }
                    else
                    {
                        k++;
                    }
                }
                if(flag==1) {
                    i++;
                }
            }
        }


    }

