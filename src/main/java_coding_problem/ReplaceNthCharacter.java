package main.java_coding_problem;

import java.util.*;

public class ReplaceNthCharacter {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter main.String");
        String str = sc.nextLine();
        char[] chars = new char[str.length()];
        for(int i=0;i<str.length();i++){
            chars[i] = str.charAt(i);
        }

        for(int i=0;i<str.length();i++){
            int chat = chars[i];
            System.out.println(chat);
            chat += 3;
            chars[i]  = (char)chat ;
        }
        System.out.println(chars);
        char ch = 87;
        System.out.println(ch);
    }
}
