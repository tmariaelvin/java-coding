package advancelevel;
import java.util.Arrays;
import java.util.Scanner;
public class checktwoarray {

    /*

     ///////////////////////////////////////
                 input a=5
                      b=5
                      array a= {1,2,3,4,5}
                      array b={1,2,3,4,5}

                output:
                       all elements are same
                       1,2,3,4,5

    /////////////////////////////////////


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
        int n, m, i, j,k=0,flag=0;
        n = sc.nextInt();
        m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        int c[]=new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (j = 0; j < m; j++) {
            b[j] = sc.nextInt();
        }
        if (m == n) {
            for (i = 0; i < n; i++) {
                flag = 0;
                for (j = 0; j < m; j++) {
                    if (a[i] == b[j]) {
                        flag = 1;
                        c[k] = a[i];
                        remove(b, j, m);
                        m--;
                    }
                }

                if (flag == 1) {
                    k++;
                }
            }
                if(k==n){
                    System.out.println(" ARRAY IN ALL ELEMENTS ARE  SAME");
                }
                if(k==0)
                {
                    System.out.println(" ARRAY IN ALL ELEMENTS ARE  Different");
                }
            System.out.println();
            for(i=0;i<k;i++)
            {
               System.out.print(c[i]+" ");
            }
        }else{
            System.out.println("TWO ARRAY ARE NOT SAME THIS ");
        }
    }

    /////////////////////////////////////////////
               input s= "elvin"
                     s1="elvin"
               output:
                   two string are same
                   elvin

    /////////////////////////////////////////////

            USING STORE  SAME ARRAY  OR   ANOTHER ARRAY




    */
    public static char[] remove(char a[],int start,int n)
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
        int n, m, i, j,k=0,flag=0;
        String s=new String();
        String s1=new String();
        s = sc.nextLine();
        s1 = sc.nextLine();
        n=s.length();
        m=s1.length();
        char ch[]=new char[n];
        char ch1[]=new char[m];
        char c[]=new char[n];
        for (i = 0; i < n; i++) {
            ch[i] = s.charAt(i);
        }
        for (j = 0; j < m; j++) {
            ch1[j] = s1.charAt(j);
        }
        System.out.println(Arrays.toString(ch));
        System.out.println(Arrays.toString(ch1));
        if (m == n) {
            for (i = 0; i < n; i++) {
                flag = 0;
                for (j = 0; j < m; j++) {
                    if (ch[i] == ch1[j]) {
                        flag = 1;
                        ch[k] = ch1[j];     //c[k]=ch1[j]
                        remove(ch1, j, m);
                        m--;
                    }
                }
                if (flag == 1) {
                    k++;
                }
            }
            if(k==n){
                System.out.println(" ARRAY IN ALL ELEMENTS ARE  SAME");
            }
            else if(k==0)
            {
                System.out.println(" ARRAY IN ALL ELEMENTS ARE  Different");
            }
            System.out.println();
            for(i=0;i<k;i++)
            {
                System.out.print(ch[i]+" ");       //c[i]
            }
        }else{
            System.out.println("TWO ARRAY ARE NOT SAME THIS ");
        }
    }


}
