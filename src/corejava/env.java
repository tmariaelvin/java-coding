package corejava;

import java.util.Map;

public class env {

    public static void main(String[] args) {
        Map<String, String> map = System.getenv();
        for (Map.Entry<String,String> entry : map.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }
}
