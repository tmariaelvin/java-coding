package advancelevel;
import java.util.*;

public class Arraylist_to_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = {"el","vi","ssds","sfdsfg"};
       // String str = new String();
         // str = String.join("", s);

  /*
         ////    Arrays.asList() method Using ////

  List<String>str=new ArrayList<String>(Arrays.asList(s));

        str.add("elvin");

            System.out.println(str);

        ////    COllections.addAll(list,STring) method ////

  List<String>str=new ArrayList<>();
        Collections.addAll(str,s);
        System.out.println(str);

        ////   add() method  ////

*/
  List<String>str=new ArrayList<>();
  for(String s1:s)
      str.add(s1);
        System.out.println(str);

    }
}
