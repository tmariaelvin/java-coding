package Testing;

public class stringappend {
    public static void main(String[] args)
    {
        // append //
        StringBuffer str=new StringBuffer();
        str.append("elvin");
        System.out.println(str);
        // insert ///
        str.insert(1,"mass");
        System.out.println(str);

        /// replace ////
        str.replace(1,2,"hello");
        System.out.println(str);
        ///Reverse   /// /
        str.reverse();
        int l=str.length();
        System.out.println(str+""+l);

    }
}
