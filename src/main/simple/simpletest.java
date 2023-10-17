package main.simple;
 import java.util.Scanner;
public class simpletest {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       double pi=3.14;
       System.out.println("Enter the ratio value");
       int ratio=sc.nextInt();
       double area=pi*ratio*ratio;
       System.out.println(+area);

    }
}
