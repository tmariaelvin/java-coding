package NewTest;

import java.util.Scanner;

public class new_sample {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year");

        //while loop
        int i=1;
        while(i<=10){
            if(i==5){
                //using continue statement
i++;
                continue;//it will skip the rest statement
            }
            System.out.println(i);
            i++;
        }
    }
}
