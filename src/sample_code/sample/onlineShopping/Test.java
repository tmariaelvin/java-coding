package sample_code.sample.onlineShopping;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Custom> cus = new ArrayList<>();
        Custom custom1 = new Custom("elvin",27);
        Custom custom2 = new Custom("arun",27);
        cus.add(custom1);
        cus.add(custom2);
        System.out.println(custom1.toString());
        cus.remove(custom1);
        custom1 = null;
        System.out.println(cus);
    }
}

 class Custom{
    String name;
    int age;
    Custom(String name,int age){
        this.name = name;
        this.age = age;
    }

     @Override
     public String toString() {
         return "name "+ name;
     }
 }