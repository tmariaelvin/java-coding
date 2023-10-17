package main.Array;

public class arraysample {
    static void printarray(int a[])
    {
        int n=a.length;
        System.out.println("\t"+n+"\n");
        for(int i=0;i<n;i++)
        {
            System.out.println("\t"+a[i]);
        }
    }
    public static void main(String []args)
    {
       /* Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int count=0;
        int b[]={1,2,3,4,5,6,7,8};
        for(int i=0;i<b.length;i++)
        {
            ++count;
        }
        System.out.println("number of b main.Array"+count);
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("print the arraty");
        for(int x:a)
        {
            System.out.println("\t"+x);
        }*/printarray(new int[]{1,1,2,3,4,5});
    }
}
