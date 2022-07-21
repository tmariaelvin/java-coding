package advancelevel;
import java.util.Scanner;
public class nthlargestelement {

    /*

    ENTER THE VALUE
6
4 7 9 1 4 6
4
1th large elemnet in array9
2th large elemnet in array7
3th large elemnet in array6
4nth largest element in array  : 4
     */


    public static int[] remove(int a[], int start, int n) {
        int i;
        for (i = start + 1; i < n; i++) {
            a[i - 1] = a[i];
        }
        return a;
    }

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

                    System.out.println(k++ +"th large elemnet in array"  +max);
                    remove(a, index, n);
                    n--;
                }
                    nth--;
                }
                System.out.println(m+ "nth largest element in array  : "+max);
            }
        }
