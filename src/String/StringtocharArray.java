package String;
import java.util.Scanner;
public class StringtocharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        System.out.println(s);
        int l = s.length();
        char ch[] = new char[l + 1];
        System.out.println(l);
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        for (char c : ch) {
            System.out.print(c + "\t");
        }
        System.out.println("\n");
        Scanner st = new Scanner(System.in);
        String str = new String();
        str = st.nextLine();
        int lt = str.length();
        char cr[] = str.toCharArray();
        System.out.println(lt);
        for (char ct : cr) {
            System.out.print(ct + "\t");

        }
    }
}
