package main.String;

public class Main {
    public static void main(String[] args) {
        String input = "ttttzff";
        StringBuilder output = new StringBuilder();
        
        int count = 1;
        char[] chars = input.toCharArray();
        
        for (int i = 1; i <= chars.length; i++) {
            if (i < chars.length && chars[i] == chars[i - 1]) {
                count++;
            } else {
                if (count > 1) {
                    output.append(count).append(chars[i - 1]);
                } else {
                    output.append(chars[i - 1]);
                }
                count = 1;
            }
        }
        
        System.out.println("Output: " + output.toString());
    }
}
