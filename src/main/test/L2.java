package main.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L2 {
    static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the steps : ");
        int steps = sc.nextInt();

        for (int i = 0; i < steps-1; i++) {
            result.add(1);
        }
        checkPossible(steps, 1,0);

        System.out.println(result);

        for (int i = 0; i < steps; i++) {

        }

    }
int position = 0 ;
    public static void checkPossible(int steps, int intialStep,int position) {
        int countSteps = 1;
        for (int i = 0; i < result.size() - 1; i++) {
            countSteps += result.get(i);
            if (countSteps == steps) {
                position+=1;
            }else{
                position+=1;
            }
        }
        if (result.size() != 0) {
            result.remove(result.size() - 1);
            checkPossible(steps, 2,0);
        }
    }

    public static void printPossible(List<Integer> outPut, int steps) {
        for (int i = 0; i < outPut.size(); i++) {
            System.out.print(outPut.get(i) + "steps + ");
        }
        System.out.println(" = " + steps);
    }

}
