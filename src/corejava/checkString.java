package corejava;

import java.util.ArrayList;
import java.util.List;

public class checkString {
    public static void main(String[]  args){
        String[] country = new String[]{"london","india","asdfg","elvine"};
        List<String> stringList = new ArrayList<>();
        for (String str : country){
            int flag = 0;
            int len = str.length();
           for(int i=0;i<len;i++){
               for (int j=i+1;j<len;j++){
                   if(str.charAt(i) == str.charAt(j)){
                       stringList.add(str);
                       flag = 1;
                       break;
                   }
               }
             if(flag == 1){
                break;
             }
           }
        }
        System.out.print(stringList.toString());
    }
}
