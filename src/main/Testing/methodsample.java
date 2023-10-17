package main.Testing;

import java.util.StringTokenizer;

public class methodsample {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my name is elvin antony");
        while (st.hasMoreElements()) {
            System.out.println(st.nextToken());
        }
    }
    }

