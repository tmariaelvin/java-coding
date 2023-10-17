package main.java_coding_problem;

import java.util.Scanner;

public class SubStringO {
    public static void main(String[] args) {
     /*   Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main.String");
        main.String str = sc.nextLine();
        int strLength = str.length();
        char[] charStr = new char[strLength];
        for(int i=0;i<strLength;i++){
            charStr[i] = str.charAt(i);
        }
        System.out.println("enter subString ");
        main.String subStr = sc.nextLine();
        char[] charSubStr = new char[subStr.length()];
        for(int j=0;j<subStr.length();j++){
            charSubStr[j] = subStr.charAt(j);
        }
        int flag = 0;
        int count =0 ,start =0,end=0 ,next=0;
        for(int i =0; i<subStr.length();i++){

            for(int j=start;j<strLength;j++){
                if(charStr[j] == charSubStr[i]){
                    count++;
                    if(count == 1){
                        start = j;
                        next = start;

                    }else if(j == next+1) {
                        next++;
                        end =j;

                    }else{
                     flag = 1;
                    }
                }
            }
            if(flag == 1){
                System.out.println(false);
                break;
            }
        }
        if(count == subStr.length()&&flag==0){
            System.out.println(true);
            System.out.println(start+" || "+end);
        }*/
    Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        //Function Call
        int res = isSubstring(s1, s2);
        if (res == -1)
            System.out.println("Not present");
        else
            System.out.println("Present at index " + res);

    }
    static int isSubstring(String s1, String s2)
    {
        // using indexOf method to check if s1 is
        // a substring of s2
        return s2.indexOf(s1);
    }
/*
    static int isSubstring(
            main.String s1, main.String s2)
    {
        int M = s1.length();
        int N = s2.length();

        *//* A loop to slide pat[] one by one *//*
        for (int i = 0; i <= N - M; i++) {
            int j;

            *//* For current index i, check for
            pattern match *//*
            for (j = 0; j < M; j++)
                if (s2.charAt(i + j)
                        != s1.charAt(j))
                    break;

            if (j == M)
                return i;
        }

        return -1;
    }

    *//* Driver code *//*
    public static void main(main.String args[])
    {
        main.String s1 = "for";
        main.String s2 = "geeksforgeeks";

        int res = isSubstring(s1, s2);

        if (res == -1)
            System.out.println("Not present");
        else
            System.out.println(
                    "Present at index "
                            + res);
    }
}*/
}
