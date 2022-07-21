package latest;



import java.util.Scanner;

public class fibno {
  /*  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int first=0,second=1,result=0;
        System.out.print(first+" "+second);
        for(int i=2;i<num;i++) {
            result = first + second;
            first=second;
            second=result;
            System.out.print(" "+result);

        }
        System.out.println("\n"+result);
    }
}
*/ /// Recurion using fibno serious ///
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
            return fib(n-1)+fib(n-2);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            result = fib(i);
            System.out.print(" " +result);
        }
    }
}