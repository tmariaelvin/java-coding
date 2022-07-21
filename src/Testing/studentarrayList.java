package Testing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.lang.String;
class student {
    int id;
    String name=new String();
    int age;
    student(String name, int id, int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }
}
public class studentarrayList {
    public static void main(String[] args) {
        int id,age;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        String name = new String();

        while(i<3) {

            System.out.println("id");
            id = sc.nextInt();
            System.out.println("age");
            age = sc.nextInt();
            System.out.println("name");
            name = sc.nextLine();
            student s0 = new student(name, id, age);
            i++;

            ArrayList<student> al = new ArrayList<>();
            al.add(s0);
            i++;
            Iterator itr = al.iterator();
            while (itr.hasNext()) {
                student st = (student) itr.next();
                System.out.println(st.id + " " + st.name + " " + st.age);
                System.out.println("next student detail enter");
                i++;
            }
        }

    }
}
