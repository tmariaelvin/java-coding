package main.NewTest;

import java.util.Scanner;

public class fibnoserious {
    static  int fibnose(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibnose(n-1)+fibnose(n-2);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first=0,second=1,fibno=0;
       // System.out.print(first+","+second);
 /*
        for(int i=1;i<n;i++){
            fibno=first+second;
            first=second;
            second=fibno;
            System.out.print(","+fibno);
        }
        System.out.println();
        System.out.print(" "+fibno);
   */
       /// Recursion  /////
        for(int i=0;i<=n;i++) {
            fibno = fibnose(i);

            System.out.print(" " + fibno);
        }

    }
}
