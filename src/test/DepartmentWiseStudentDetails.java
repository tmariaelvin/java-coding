package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    private String name;
    private String department;
    private int id;

    // Constructor
    public Student(String name, String department, int id) {
        this.name = name;
        this.department = department;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    // Override toString for easy printing
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department;
    }
}

public class DepartmentWiseStudentDetails {

    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "Computer Science", 101));
        students.add(new Student("Bob", "Mechanical Engineering", 102));
        students.add(new Student("Charlie", "Computer Science", 103));
        students.add(new Student("Diana", "Electrical Engineering", 104));
        students.add(new Student("Eve", "Mechanical Engineering", 105));

        // Create a map to store department-wise student details
        Map<String, List<Student>> departmentWiseMap = new HashMap<>();

        // Populate the map
        for (Student student : students) {
            departmentWiseMap
                    .computeIfAbsent(student.getDepartment(), k -> new ArrayList<>())
                    .add(student);
        }

        // Print the department-wise student details
        for (Map.Entry<String, List<Student>> entry : departmentWiseMap.entrySet()) {
            String department = entry.getKey();
            List<Student> departmentStudents = entry.getValue();
            System.out.println("Department: " + department);
            departmentStudents.forEach(student -> System.out.println("\t" + student));
        }

        // Group students by department using streams
        Map<String, List<Student>> departmentWiseMap1 = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment));

        // Print the department-wise student details
        departmentWiseMap.forEach((department, departmentStudents) -> {
            System.out.println("Department: " + department);
            departmentStudents.forEach(student -> System.out.println("\t" + student));
        });
    }
}
