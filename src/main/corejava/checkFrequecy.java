package main.corejava;

import java.util.Scanner;

public class checkFrequecy {

    public static void main(String []args){


        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string : ");
        String str1 = sc.nextLine();
        System.out.println("enter first string : ");
        String str2 = sc.nextLine();
        int len = str1.length();
        char[] charArray1 = new char[len];
        char[] charArray2 = new char[len];
        int [] str1Array = new int[len];
        int [] str2Array = new int[len];

        for(int i=0;i<len;i++) {
            charArray1[i] = str1.charAt(i);
        }
        for(int i=0;i<len;i++) {
            charArray2[i] = str2.charAt(i);
        }

        for (int i=0;i<len;i++){
            int count  = 0;
            for(int j=i+1;j<len;j++){
                if(charArray1[i] == charArray1[j]){
                 count++;
                }
            }
            str1Array[i]  = count;
        }
        for (int i=0;i<len;i++){
            int count  = 0;
            for(int j=i+1;j<len;j++){
                if(charArray2[i] == charArray2[j]){
                    count++;
                }
            }
            str2Array[i]  = count;
        }
        int count =0;
        for(int i=0;i<len;i++){
            if(str1Array[i] == str2Array[i]){
                count++;
            }
        }
        if(count == len){
            System.out.print(true);
        }else{
            System.out.println(false);
        }


    }

}
