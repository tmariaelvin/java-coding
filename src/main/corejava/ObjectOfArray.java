package main.corejava;



import java.util.*;

//main.employee class implementing comparable interface for array of objects
class Employee  {
    private String name;
    private int empId;
    //constructor
    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    //overridden functions since we are working with array of objects
    @Override
    public String toString() {
        return "{" + "name='" + name + '\'' +
                ", EmpId=" + empId + '}';
    }

    //compareTo method overridden for sorting array of objects

}

//main class

public class ObjectOfArray {
    public static void main(String[] args)
    {
        //array of Employee objects
        Employee[] employees = { new Employee("Rick", 1), new Employee("Sam", 20),
                new Employee("Adi", 5), new Employee("Ben", 10) };

        //print original array

        //sort array on empId

        //display sorted array
        System.out.println("\nSorted main.Array of Employee objects:");
        System.out.println(Arrays.toString(employees));
    }
}
