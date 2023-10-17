package main.corejava;

import java.util.ArrayList;

public class tokenization {

    static void create(String value, char splitBy) {
        String s1 = value;
        String s2 = "";
        ArrayList list = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = splitBy;
            if (ch1 != ch2) {
                s2 = s2 + ch1;
            } else {
                list.add(s2);
                s2 = "";
            }
        }
        list.add(s2);
        System.out.println(list);
    }
    public static void main(String[] args) {
        create("Repeat var=M start=5 until=20 ", ' ');
    }
}
