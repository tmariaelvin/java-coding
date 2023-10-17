package main.Testing;

class Student{
    int id;
    String name;
    Student(int id,String name)
    {
        this.id=id;this.name=name;
        System.out.println(id+"\n"+name);
    }
    Student(student s)
    {
        id=s.id;
        name=s.name;
       System.out.println(id+"\n"+name);
    }
}
public class constructor {
    public static void main(String[] args)
    {
        Student s1=new Student(1,"elvin");
    }
}
/*
class calculate
    {
    static int cal(int i)
    {
        return i*i*i;
    }
}
public class constructor{
    public static void main(main.String[] args)

    {
        calculate ca=new calculate();
        int n=ca.cal(5);
        System.out.println(n);
    }}*/