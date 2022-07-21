package Testing;

import static incubation.patarnhalfofdiamond.print;

public class stringsplit {
    public static void main(String[] args)
    {
        String str=new String("hi @hello @my @name @is @elvin @antony ");
       /* String[] st=str.split("@");
        for(String s:st)
        {
System.out.println(s);
        }*/
       String[] st=str.split("\\s");
       System.out.println(st[1]);
    }
}
