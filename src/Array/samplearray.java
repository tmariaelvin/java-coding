package Array;
import java.util.Scanner;
public class samplearray {
    public static void main(String[] args)
    {
        int min=0,max=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            System.out.print(a[i]+"\t");
        }
        min=a[0];max=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("minmum value"+min+"\nmaximum value"+max);
    }
}
