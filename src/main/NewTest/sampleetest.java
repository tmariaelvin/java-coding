package main.NewTest;

import java.util.Scanner;

public class sampleetest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuffer st=new StringBuffer(str);
        st.append(sc.nextLine());
        st.append(sc.nextLine());
        System.out.print(st);
    }
}
