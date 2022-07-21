package advancelevel;
import java.util.Arrays;
import java.util.Scanner;
public class reversearray {
    /*
    ///   single Array using reverse the array ///
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
      int n,i,j;
      n=sc.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
          a[i]=sc.nextInt();
      for(i=0;i<n/2;i++)
      {
          int temp=a[i];
          a[i]=a[n-i-1];
          a[n-i-1]=temp;
      }
      System.out.println(Arrays.toString(a));
    }

    ///  CReate new Array in reverse ///



    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            b[n-i-1]=a[i];
        }
        System.out.println(Arrays.toString(b));
    }

   //// reverse string or character  ///


          input : abcdef

          output : fedcba





    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;

        String s=new String();
            s=sc.nextLine();
        n=s.length();
        char ch[]=new char[s.length()];
        char ch1[]=new char[s.length()];
           for(i=0;i<n;i++)
               ch[i]=s.charAt(i);
        for(i=0;i<n;i++)
        {
           ch1[n-i-1]=ch[i];
        }
        for(i=0;i<n;i++)
        System.out.print(ch1[i]+" ");
    }
/////// REVERSE STRING IN AN ARRAY /////////////




*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, count = 0, k = 0;

        String s = new String();
        s = sc.nextLine();
        n = s.length();
        String str[] = new String[n];

        str=s.split("\\s");

        for (j = 0;j<n; j++) {
            System.out.print(str[j]+" ");
        }

    }

}
