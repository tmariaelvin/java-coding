package advancelevel;
import java.util.Scanner;
public class maxandmininarray {
    /*
 /////////////////////////////////////////////
     input : 5
         1 4 6 9 2

     output :
          maxvalue : 9

  /////////////////////////////////////////

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,max=0,min=0;
         n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        max=0;
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("maximum value of in an array   "+max);
    }

//////////////////////////////
    input : 5
          4 6 9 2 7

     output :
          minvalue : 2

 //////////////////////////////

*/

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,max=0,min=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        min=a[0];
        for(i=1;i<n;i++)
        {
            if(a[i]<min)

            {
                min=a[i];
            }
        }
        System.out.println(" minmum value of in array  "+min);
    }
}
