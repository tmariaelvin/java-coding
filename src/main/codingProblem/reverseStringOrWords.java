package main.codingProblem;

public class reverseStringOrWords {
    public static void main(String[] args){
        String str = "hello world";
        System.out.println("Iterate method using reverse : " + stringReverse(str));
        System.out.println("StringBuffer using Reverse : " + stringReverseUsingStringBuffer(str));
    }

    public static String stringReverse(String str){
        String rev ="";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }

        return rev;
    }
    public  static String stringReverseUsingStringBuffer(String str){
        StringBuffer stringBuffer = new StringBuffer(str);
        return stringBuffer.reverse().toString();
    }
    }

