package main.java_coding_problem;

import java.util.Scanner;

public class ReverseWithoutSpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        char[] chars = new char[len];
        for (int i = 0; i < len; i++) {
            chars[i] = str.charAt(i);
        }
        int i = 0;
        int j = len-1;
        while (i < len) {
            if(i > j){
                break;
            }
                if (chars[i] >= 'a' && chars[i] <= 'z') {
                    if (chars[j] >= 'a' && chars[j] <= 'z') {
                       char temp = chars[i];
                       chars[i] = chars[j];
                       chars[j] = temp;
                       j--;
                       i++;
                    }
                    else{
                        j--;
                    }
                }else{
                    i++;
                }

            }
        System.out.println(chars);
        }


}
