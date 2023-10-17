package main.latest;


/*
#1 main.sample Input output:
enter the first main.String
        elvin
        enter the second main.String
        nivle
        Two main.String are anagram
  #2
enter the first main.String
dsds
enter the second main.String
erre
not anagram
*/



import java.util.Scanner;

public class anagram {


    public static char[] removeChar(char[] ch, int start, int n) {
        for (int i = start + 1; i < n; i++) {
            ch[i - 1] = ch[i];
        }
        return ch;
    }
    public static char[] loadStringToCharArray(char[] charArray,String str){
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1,str2;
        int str1Length, str2Length, count = 0, flag = 0;
        System.out.println("enter the first main.String");
        str1 = sc.nextLine();
        System.out.println("enter the second main.String");
        str2 = sc.nextLine();
        str1Length = str1.length();
        str2Length = str1.length();
        str1.toLowerCase();
        str2.toLowerCase();
        char charArray1[] = new char[str1Length];
        char charArray2[] = new char[str2Length];

        if (str1Length != str2Length) {
            System.out.println("not anagram");
        } else {
            charArray1 = loadStringToCharArray( charArray1 ,str1);
            charArray2 = loadStringToCharArray( charArray2 ,str2);

            for (int i = 0; i < str1Length; i++) {
                flag = 0;
                for (int j = 0; j < str2Length; j++) {
                    if (charArray1[i] == charArray2[j]) {
                        count++;
                        removeChar(charArray2, j, str2Length);
                        str2Length--;
                        flag = 1;
                        break;
                    }

                }
                if (flag == 0) {
                    break;
                }
            }
            if (count == str1Length) {
                System.out.println("Two main.String are anagram");
            } else {
                System.out.println("not anagram");
            }
        }
    }
}
