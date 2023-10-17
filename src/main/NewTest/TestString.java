package main.NewTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestString {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> str = new ArrayList<>();
        for(int i=0;i<n;i++) {
            str.add(sc.nextLine());
        }
        str.add("antony");
        str.add("mariya");
        str.add("mass");
        Iterator itr = str.iterator();
        while (itr.hasNext()) {
            String st=(String) itr.next();
            System.out.println(st);
        }
    }
}
