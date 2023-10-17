package main;

import java.io.FileWriter;
import java.io.*;
public class filewriter {
    public static void main(String[] args)
    {
        String s="ia m write a java code in this priogram int he mission is complehtre the rmemporhtu";
        try (FileWriter outFile = new FileWriter("Data.txt");
             BufferedWriter bWriter = new BufferedWriter(outFile)) {
            bWriter.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
