package advancelevel;
import java.util.ArrayList;
import java.util.List;
import java.lang.*;
import java.util.Scanner;
public class array_to_Arraylist {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        List<String>a1=new ArrayList<String>();
        a1.add("elvi");
        a1.add("anto");
        a1.add("mass");
        /*
        /// THIS METHOD   T[]toArray(a.size())////

        String[] a=new String[a1.size()];
        a=a1.toArray(a);
        for(String x:a)
            System.out.println(x);

    ///   THIS METHOD Object[]toArrays[] NOT MENTION LENGTH  ///

        Object[] a=a1.toArray();
        for(Object obj:a)
        {
            System.out.println(obj);
        }

        ///  get()method ///
                */
        String[] a=new String[a1.size()];
        for(int i=0;i<a1.size();i++)
        {
            a[i]=a1.get(i);
        }
        for(String s:a)
        {
            System.out.println("ARRAY  "+s);
        }


    }
}

