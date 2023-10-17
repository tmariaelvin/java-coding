package main.june2023;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordCheck {

    // enter valid password must 8 characters Upper letter and special character and numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password");
        boolean pass = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).{8,}$", "elvinsMM#@s12");
       System.out.println(pass);
    }
}
