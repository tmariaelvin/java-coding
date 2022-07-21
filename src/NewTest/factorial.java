package NewTest;

import java.util.Scanner;

import static NewTest.factorial.fun;

public class factorial {

    public static int fun(int n){
        if(n==1){
            return 1;
        }
        else{
            return fun(n-1)*n;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(" "+fact);
       System.out.println(fun(n));


    }
}
