package main.String;
import java.io.*;

public class bufferreader {
    public static void main(String[] args)throws IOException
    {



        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        System.out.printf("%s",s);
     /*   Scanner sc=new Scanner(System.in);
        main.String s1=sc.nextLine();
        int b=sc.nextInt();
        System.out.println(" "+b+" "+s1);*/
    }
}
