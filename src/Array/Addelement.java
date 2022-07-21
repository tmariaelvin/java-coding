package Array;

import java.util.Arrays;

public class Addelement {

    public static int add(int[] a, int x, int n, int index)
    {
        int start;
        int[] na=new int[n+1];
        for(start=n-1;start>=0;start--) {
            if (start >= index) {
                a[start + 1] = a[start];
            }
            else
            {
                a[start]=a[start];
            }

        }
        a[index] = x;
        return 0;
    }



    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5};
        int n=a.length;
        System.out.println(n);
        System.out.println(Arrays.toString(a));
        int x=10,index=2;
        add(a,x,n,index);
        System.out.println(Arrays.toString(a));
    }
}
