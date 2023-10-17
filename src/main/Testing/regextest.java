package main.Testing;

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
        main.String[] s=p.split("www.awalsoft.com");

        for(main.String st:s)
        {
            System.out.println(st);
        }
        /////     main.String clss using split() /////////
        main.String s="www.awwalsoft.com";
        main.String[] s1=s.split("\\.");
        for(main.String st:s1)
        {
            System.out.println(st);
        }
        //////////   main.String Tokenizer   //////
        StringTokenizer st=new StringTokenizer(" awwal soft");
        while (st.hasMoreElements())
        {
            System.out.println(st.nextToken());
        }
        ///////// mobile number check in pattern and matcher method using Regular expression ///////////

        main.String s="919688180407";
        Pattern p=Pattern.compile("(91)?[7-9][0-9]{9}");
        Matcher m=p.matcher(s);
        if(m.find()&&m.group().equals(s))
        {
          System.out.println("correct");

        }else{
            System.out.println("Not");
        }
            System.out.println(m.group());

        ///////////  Gmail Check in Patten Matcher function using main.String Regular ////////


        main.String s="elvin0123456789@gmail.com";
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
