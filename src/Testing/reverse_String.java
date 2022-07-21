package Testing;

public class reverse_String {
    public static void main(String args[])
    {
        String str="mariaelvin";

        int l=str.length();
        for(int i=l-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
    }
}
