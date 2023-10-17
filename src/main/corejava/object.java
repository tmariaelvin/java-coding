package main.corejava;

import java.util.Arrays;
import java.util.Scanner;

public class object {


    public static void main(String args[]) {
        Student[] arr = new Student[1];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        boolean flag = true;
        while(flag){
            System.out.print("1 : select add ");
            System.out.print("2 : show data ");
            System.out.print("3 : quit ");
            int select = sc.nextInt();

            switch (select){
                case 1:
                    System.out.print("Enter the student Id ");
                    int id = sc.nextInt();
                    System.out.print("Enter the student Name ");
                    String name =  sc.next();
                    arr[count++] = new Student(id, name);
                    break;
                case 2 :
                    System.out.println(Arrays.toString(arr));
                    break;

                case 3:
                    flag = false;
                    System.exit(0);

                default:

                    System.out.print("Enter Valid number ");
                    break;
            }
        }

    }
/*    public static void addArrayOfObject(Student[] array,int id, main.String name,int index){
        array[index] = new Student(id, name);
    }*/
}

    class Student {

        public int id;
        public String name;

        Student(int id, String name)
        {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "name '" + name + '\'' +
                  "\n"+  " EmpId " + id ;
        }


    }
