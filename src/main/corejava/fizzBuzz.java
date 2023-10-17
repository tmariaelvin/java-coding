package main.corejava;

import java.util.Scanner;

public class fizzBuzz {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        if(number%5 == 0){
            if(number%3 == 0){
                System.out.println("FizzBuzz");
                return;
            }
                System.out.println("Fizz");
        }
        else if(number%3 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(number);
        }
        }

}
