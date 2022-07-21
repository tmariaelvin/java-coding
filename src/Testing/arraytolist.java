package Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class arraytolist {
    public static void main(String[] args){
/*
        Scanner sc=new Scanner(System.in);
        int n=5;

        String[] array=new String[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextLine();
        }
        System.out.println("print the array"+ Arrays.toString(array));
        List<String> st=new ArrayList<>();

       for(String str:array){
        st.add(str);
       }
        System.out.println("another way of print list "+st);

    ///////////////        List To Array ////////////
        */
  Scanner sc=new Scanner(System.in);
  ArrayList<String> list=new ArrayList();
  list.add("mass");
        list.add("anto");
        list.add("elvi");
        list.add("kedi");
        list.add("rascal");
        System.out.println(list);
        String[] str=list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(str));
    }
    }
