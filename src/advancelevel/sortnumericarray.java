package advancelevel;
import java.util.Arrays;
import java.util.Scanner;
public class sortnumericarray {

    /*


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        int a[];
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            //System.out.print("\t"+a[i]);
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(a));
    }

    input : dcabefghz
    output: a b c d e f g h z

*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        String s = new String();
        s = sc.nextLine();
        int l = s.length();
        char ch[] = new char[l];
        for (i = 0; i < l; i++) {
            ch[i] = s.charAt(i);
        }
        for (i = 0; i < l; i++){
                    for (j = i + 1; j < l; j++) {

            if (ch[i] > ch[j]) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
            }
        }
    }

        System.out.print(Arrays.toString(ch));
        System.out.println();

    for(i =0;i<l;i++)

    {

        System.out.print(ch[i]);
    }
}
    }

