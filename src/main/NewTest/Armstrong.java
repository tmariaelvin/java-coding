package main.NewTest;

import java.util.Scanner;

public class Armstrong {
    static int power(int m,int rem) {
        if (m == 1) {
            return rem;
        } else {

            return power(m - 1, rem) * rem;
        }
    }/*
    int i,j=1;
    System.out.println(" "+m+""+rem);
        for(i=0;i<m;i++){
            j=j*rem;
        }
        System.out.println(j);
        return j;
    }*/
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,rem=0,total=0,count=0,k=0,m=0;
        n=sc.nextInt();
        k=n;
        int l=n;
        while(l>0){
            l/=10;
            count++;
        }
        m=count;
        while(n>0){
            rem=n%10;
            total=total+power(m,rem);
            n/=10;
        }
        if(total==k){
            System.out.println("armstrong number  "+total);
        }
        else{
            System.out.println("Normal number   "+total);
        }
    }
}
