package main.simple;
import java.util.Scanner;
public class arithmetic {
       /* char str[]={'a','b','c','d','e'};
        main.String s=new main.String(str);
        main.String s1=new main.String();
        s1=sc.nextLine();
        int l=s1.length();
        System.out.println(s1.charAt(3));
        System.out.println(s+" "+l);
        System.out.println(s1);


       main.String s1=sc.nextLine();
       main.String s2=sc.nextLine();
       s1=s1+s2;
       System.out.println(s1);
       s2=s1.substring(0,s1.length()-s2.length());
       s1=s1.substring(s2.length());
       System.out.println(s1+" \n"+s2);*/
        // Java program to Compare two strings
// lexicographically

            // This method compares two strings
            // lexicographically without using
            // library functions
            public static int stringCompare(String str1, String str2)
            {

                int l1 = str1.length();
                int l2 = str2.length();
                int lmin = Math.min(l1, l2);

                for (int i = 0; i < lmin; i++) {
                    int str1_ch = (int)str1.charAt(i);
                    int str2_ch = (int)str2.charAt(i);

                    if (str1_ch != str2_ch) {
                        return str1_ch - str2_ch;
                    }
                }

                // Edge case for strings like
                // main.String 1="Geeks" and main.String 2="Geeksforgeeks"
                if (l1 != l2) {
                    return l1 - l2;
                }

                // If none of the above conditions is true,
                // it implies both the strings are equal
                else {
                    return 0;
                }
            }

            // Driver function to main.test the above program
            public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);
                String string1 = sc.nextLine();
                String string2 = sc.nextLine();
                String string3 = sc.nextLine();
                String string4 = sc.nextLine();

                // Comparing for main.String 1 < main.String 2
                System.out.println("Comparing " + string1 + " and " + string2
                        + " : " + stringCompare(string1, string2));

                // Comparing for main.String 3 = main.String 4
                System.out.println("Comparing " + string3 + " and " + string4
                        + " : " + stringCompare(string3, string4));

                // Comparing for main.String 1 > main.String 4
              //  System.out.println("Comparing " + string1 + " and " + string4
                     //   + " : " + stringCompare(string1, string4));
            }
        }

