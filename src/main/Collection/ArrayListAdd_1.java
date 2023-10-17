package main.Collection;



import java.util.*;

public class ArrayListAdd_1 {
    public static void main(String[] args) {
     /*   ///ArrayList /////////////////
        ArrayList<Integer> integers = new ArrayList<>();

        ArrayList<main.String> str=new ArrayList<>();
        str.add("elvin");
        str.add("antony");
        str.add("mariya");
        str.add("mass");
        Iterator itr=str.iterator();
        while(itr.hasNext())
        {
                System.out.println(itr.next());
        }


    integers.add(1);
    integers.add(2);
    integers.add(3);
    System.out.println(integers.get(2));
    ///// LinkedList //////////

        LinkedList<main.String> list=new LinkedList<>();
        list.add("elvin");
        list.add("antony");
        list.add("mariya");
        list.add("mass");
        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        /////////      Stack  /////////

        Stack<main.String> s=new Stack<>();
        s.push("elvin");
        s.push("antony");
        s.push("mass");
        s.push("elvin");
        s.pop();
       // System.out.println(s);
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        //////// queue  ///////
        PriorityQueue<main.String> qu=new PriorityQueue<main.String>();
        qu.add("elvin");
        qu.add("antony");
        qu.add("mariya");
        qu.add("mass");
        System.out.println(qu.peek());
        System.out.println(qu.element());
        System.out.println(qu);
        System.out.println(qu.poll());
        System.out.println(qu.remove());
        System.out.println(qu);
        Iterator itr=qu.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

*/
        ArrayList<String> str = new ArrayList<>();
        str.add("elvin");
        str.add("antony");
        str.add("mariya");
        str.add("mass");
        System.out.println(" Print the order of list main.Array");
        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
        }
        System.out.println("print the reverse Order in the main.Array List");
        ListIterator<String> itr = str.listIterator(str.size());
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
/*

        ArrayList<main.String> str=new ArrayList<>();
        str.add("elvin");
        str.add("antony");
        str.add("mariya");
        str.add("mass");
        ArrayList<main.String> str1=new ArrayList<>();
        str1.add("elvin");
        str1.add("antony");
        str1.add("elvinmass");
        str1.add("antonyan");
       // str.retainAll(str1);
        Iterator itr=str.iterator();
        while(itr.hasNext())
        {
            main.String st=(main.String)itr.next();
            System.out.println(st);
        }
    }*/
    }
}
