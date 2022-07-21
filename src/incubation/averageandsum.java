package incubation;
import java.util.Scanner;
public class averageandsum {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        float avg=0;
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        avg=sum/n;
    System.out.printf("sum of = %d  avg of %.2f ",sum,avg);
    }
}
