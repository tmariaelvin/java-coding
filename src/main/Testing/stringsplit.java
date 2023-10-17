package main.Testing;

public class stringsplit {
    public static void main(String[] args)
    {
        String str=new String("hi @hello @my @name @is @elvin @antony ");
       /* main.String[] st=str.split("@");
        for(main.String s:st)
        {
System.out.println(s);
        }*/
       String[] st=str.split("\\s");
       System.out.println(st[1]);
    }
}
