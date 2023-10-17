package main.advancelevel;


import java.util.Arrays;
import java.util.Scanner;
public class arrayindexandvalue {


    /*

    input : 5
        [ 1,2,3,4,5,6,7,8]

    value: 4
        output: index : 3
                value  : 4



    public static void main(main.String[] args) {
        Scanner sc = new Scanner(System.in);
    int i,j,n,x,index=0,flag=0,value=0;
    n=sc.nextInt();
    int a[]=new int[n];

    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();

    }
        x=sc.nextInt();
        System.out.println(Arrays.toString(a));
    for(i=0;i<n;i++)
    {
        if(a[i]==x)
        {
            flag=1;
            index=i;
            value=a[i];
            break;
        }
    }
    if(flag==1)
    {
        System.out.println("index : "+index+"  value  : "+value);}else{
        System.out.println("not found in this array");
    }
    }
       input : 5

       [1,2,3,4,5]
     index=  2
       output:

       value  = 3



    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,n,x,index=0,flag=0,value=0;
        n=sc.nextInt();
        int a[]=new int[n];

        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }
        x=sc.nextInt();
        System.out.println(Arrays.toString(a));
        for(i=0;i<n;i++)
        {
            if(i==x)
            {
                flag=1;
                index=i;
                value=a[i];
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("index : "+index+"  value  : "+value);}else{
            System.out.println("not found in this array");
        }
    }

}
