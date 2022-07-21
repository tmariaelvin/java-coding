package Testing;

import java.util.StringTokenizer;
import java.util.regex.*;

public class regextest {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[.]");
        Matcher m = p.matcher("www.awalsoft.com");
        while (m.find()) {
            System.out.println(m.start() + "-----" + m.end() + "-----" + m.group());
        }


/*
/////// Pattern Split() clss method  /////////
        String[] s=p.split("www.awalsoft.com");

        for(String st:s)
        {
            System.out.println(st);
        }
        /////     String clss using split() /////////
        String s="www.awwalsoft.com";
        String[] s1=s.split("\\.");
        for(String st:s1)
        {
            System.out.println(st);
        }
        //////////   String Tokenizer   //////
        StringTokenizer st=new StringTokenizer(" awwal soft");
        while (st.hasMoreElements())
        {
            System.out.println(st.nextToken());
        }
        ///////// mobile number check in pattern and matcher method using Regular expression ///////////

        String s="919688180407";
        Pattern p=Pattern.compile("(91)?[7-9][0-9]{9}");
        Matcher m=p.matcher(s);
        if(m.find()&&m.group().equals(s))
        {
          System.out.println("correct");

        }else{
            System.out.println("Not");
        }
            System.out.println(m.group());

        ///////////  Gmail Check in Patten Matcher function using String Regular ////////


        String s="elvin0123456789@gmail.com";
        System.out.println("check the input "+s);
        Pattern p=Pattern.compile("[a-zA-Z][a-zA-Z0-9]*@[a-zA-Z]+([.][a-zA-Z]+)+");
        Matcher m=p.matcher(s);
        if(m.find()&&m.group().equals(s))
        {
            System.out.println("correct");

        }else{
            System.out.println("Not");
        }
        System.out.println(" correct out put "+m.group());
*/
    }
}
