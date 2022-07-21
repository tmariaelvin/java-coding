package advancelevel;
import java.util.Scanner;
public class Removedoublicate {


    public static int[] remove(int a[],int start,int n)
    {
        int i;
        for(i=start+1;i<n;i++)
        {
            a[i-1]=a[i];
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ARRAY");
        int n, m, i, j,k=0,flag=0;
        n = sc.nextInt();
        int a[] = new int[n];
       int b[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
             m=n;
            for (i = 0; i < m; i++) {
                flag=0;
                for (j = i+1; j < m; j++) {
                    if (a[i] == a[j]) {
                        flag = 1;
                        remove(a,j,m);
                        m--;
                        // c[k] = a[i];
                    }
                }
                if(flag==0)
                {
                    System.out.println(a[i]);
                    b[k++]=a[i];
                }

                   // System.out.println(a[i]);
            }
            System.out.println();
            for(i=0;i<k;i++)
            {
                System.out.print(b[i]+" ");
            }
    }
}
