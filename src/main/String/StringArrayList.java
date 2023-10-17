package main.String;

import java.util.Scanner;

public class StringArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println(st);
        String str = sc.nextLine();
        System.out.println(str);

        for(int i = 0; i <str.length();i++) {
            if(str.charAt(i)==' ') { // whenever it found space it'll create separate words from string
                System.out.println();
                continue;
            }
            System.out.print(str.charAt(i));
        }

    }
}
