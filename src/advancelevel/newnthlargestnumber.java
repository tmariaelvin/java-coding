package advancelevel;

import java.util.Scanner;

public class newnthlargestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE");
        int n, nth, i, j, max = 0, index = 0, k=1;;
        n = sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        nth = sc.nextInt();
        int m=nth;
        while (nth > 0) {
            max=0;
            for (i = 0; i < n; i++) {

                if (max < a[i]) {
                    max = a[i];
                    index = i;
                }
            }
            if(nth-1>0) {

               // System.out.println(k++ +"th large elemnet in array"  +max);
               // remove(a, index, n);
                a[index]=-1;
               // n--;
            }
            nth--;
        }
        System.out.println(m+ "nth largest element in array  : (5"+max+" ,  "+index+")" );
    }
}

