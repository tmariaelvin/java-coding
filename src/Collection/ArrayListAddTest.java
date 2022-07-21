package Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListAddTest {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>str=new ArrayList<>();
        str.add("elvin");
        str.add("antony");
        str.add("mass");
        str.add(1,"Arun");
        str.add(2,"alagu");
        System.out.println(str);

        for(String st:str)
        {
            System.out.println(st);
        }
        /*System.out.println(str.get(3));
        System.out.println(str.contains(str.get(2)));
        System.out.println(str.size());
        str.remove(1);
        System.out.println(str.size());*/
    }
}
