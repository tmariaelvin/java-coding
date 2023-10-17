package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    private static final String EMAIL_REGEX_PATTERN = "^[\\w-\\. +\"]+@([\\w-\\[]+\\.)+[\\w-\\]]{2,7}$";
    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] emails = {
                "email@example.com",
                "firstname.lastname@example.com",
                "email@subdomain.example.com",
                "firstname+lastname@example.com",
                "email@123.123.123.123",
                "email@[123.123.123.123]",
                "\"email\"@example.com",
                "1234567890@example.com",
                "email@example-one.com",
                "_______@example.com",
                "email@example.name",
                "email@example.museum",
                "mail@example.co.jp",
                "firstname-lastname@example.com",
                "email@123.123.123.1",
        };

        for (String email : emails) {
            boolean isValid = isValidEmail(email);
            System.out.println(email + ": " + isValid);
        }
    }
}
