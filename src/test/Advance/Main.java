package test.Advance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<RandomizedSet> randomizedSets = new ArrayList<>();
    static RandomizedSet activeRandomizedSet = null;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("RandomizedSet");
        input.add("insert");
        input.add("remove");
        input.add("insert");
        input.add("getRandom");
        input.add("remove");
        input.add("insert");
        input.add("getRandom");
        showRandomizedSetMethods();
    }

    public static void showRandomizedSetMethods() {
        System.out.println("1, RandomizedSet\n2, insert\n3, remove\n4, getRandomValue\n5, Exit");
        System.out.println("Chooses the RandomizedSet method");
        int select = sc.nextInt();
        switch (select) {
            case 1 -> {
                RandomizedSet randomizedSet = new RandomizedSet(new int[1]);
                activeRandomizedSet = randomizedSet;
                System.out.println("Successfully Created the RandomizedSet");
                showRandomizedSetMethods();
            }
            case 2 -> {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Insert value");
                int insertValue = sc.nextInt();
                Boolean isInserted = activeRandomizedSet.insert(insertValue);
                if (!isInserted) {
                    System.out.println(false);
                } else {
                    System.out.println("successfully Insert the value");
                }
                showRandomizedSetMethods();
            }
            case 3 -> {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the remove value");
                int RemoveValue = sc.nextInt();
                Boolean isRemoved = activeRandomizedSet.remove(RemoveValue);
                if (!isRemoved) {
                    System.out.println(false);
                } else {
                    System.out.println("successfully Removed");
                }
                showRandomizedSetMethods();
            }
            case 4 -> {
                int randomValue = activeRandomizedSet.getRandom();
                if(randomValue<0){
                    showRandomizedSetMethods();
                }
                System.out.println(" Successfully get Random value : " + randomValue);
                showRandomizedSetMethods();
            }
            case 5 -> {
                System.out.println("Thanks");
            }
        }

    }
}
