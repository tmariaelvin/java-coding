package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L22 {
    static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the steps : ");
        int steps = sc.nextInt();

        for (int i = 0; i < steps; i++) {
            result.add(1);
        }

        int posiablity = 0;

        int countSteps = steps;
         int posiable =0 ;
        if (result.size() > 2) {
            result.remove(result.size() - 1);
            result.remove(result.size() - 1);
            checkPosiable(countSteps,posiable);
        }
        else {
            System.out.println(countSteps);
        }
    }
    public static void checkPosiable(int countSteps,int posiable){
        if (result.size() > 2) {
            posiable = result.size()-2;
            countSteps+=posiable;
            if(posiable==1){
                countSteps+=1;
            }
            if(result.size()>2){
                result.remove(result.size() - 1);
                checkPosiable(countSteps,posiable);
            }else{
                countSteps+=2;
                System.out.println(countSteps+1);
            }
        }else {
            if(result.size() == 2){
                System.out.println(countSteps+1);
            }else{
                System.out.println(countSteps);
            }

        }
    }
}
