package main.String;

public class string {
    public static void main(String[] args)
    {
        char s[]={'a','b','c'};
        String str="abcdefchijk";
        String str1="abcd";
        String str3;
        StringBuffer str2=new StringBuffer("abcd");
        str2.append("hello");
        System.out.println(str2);
        String str4=str1.intern();
        System.out.println(str4);
        int a=10;
        String st=String.valueOf(a);
        System.out.println(st+10);
        String st1=str.replace("abc","zxy");
        System.out.println(st1);
        System.out.println();

       /* System.out.println(str2.equals(str));
        System.out.println(str.compareTo(str1));
        System.out.println(str3=str.concat(str1));
        System.out.println(str.substring(0,str.length()-1));
        System.out.println(str.substring(4));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str);
        System.out.println(str.charAt(0)+"\t"+str.charAt(5));*/
    }
}
