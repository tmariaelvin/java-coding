/*
package main.corejava;


// Java code to demonstrate the concept of
// array of ArrayList

import java.util.*;


public class testArrayList {
    public static void main(main.String args[]) {
        ArrayList<Dog> obj = new ArrayList<Dog>();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("\t\t\tRescue Animal System Menu");
            System.out.println("[1] Intake a new dog");
            System.out.println("[2] Print list of all dogs");
            System.out.println("[q] Quit application");
            System.out.println("\nEnter a menu Selection \t");
            int select = sc.nextInt();

            switch (select) {
                case 1:
                    System.out.print("Enter the Dog name ");
                    main.String name = sc.next();
                    System.out.print("What is the Dog breed ? ");
                    main.String breed = sc.next();
                    obj.add (new Dog(name, breed)) ;
                    break;
                case 2:
                    for (int i = 0; i < obj.size(); i++) {
                        obj.get(i).display();
                    }
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

    }

    class Dog {
      main.String name;
        main.String breed;

        Dog(main.String name,main.String breed) {
             this.name =  name;
            this. breed =  breed;
        }

        public void display() {
            System.out.print("Name : " + name + " \n " + "Breed  : " + breed);
        }
    }
*/
package main.corejava;


// Java code to demonstrate the concept of
// array of ArrayList

import java.util.*;


public class testArrayList {
    public static void main(String args[]) {
        ArrayList<Dog> obj = new ArrayList<Dog>();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("\t\t\tRescue Animal System Menu");
            System.out.println("[1] Intake a new dog");
            System.out.println("[2] Print list of all dogs");
            System.out.println("[q] Quit application");
            System.out.println("\nEnter a menu Selection \t");
            int select = sc.nextInt();

            switch (select) {
                case 1:
                    System.out.print("Enter the Dog name ");
                    String name = sc.next();
                    System.out.print("What is the Dog breed ? ");
                    String breed = sc.next();
                    obj.add (new Dog(name, breed)) ;
                    break;
                case 2:
                    for (int i = 0; i < obj.size(); i++) {
                        obj.get(i).display();
                    }
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

}

class Dog {
    String name;
    String breed;

    Dog(String name,String breed) {
        this.name =  name;
        this. breed =  breed;
    }

    public void display() {
        System.out.print("Name : " + name + " \n " + "Breed  : " + breed);
    }
}
