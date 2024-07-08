package learn;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
      M1    M2   M3
Home1  1    2    3
Home2  3    1    2
Home3  5    2    1
Explain
Most profit material cost in the home
Ans  1+1+1 = 3;
*/
public class ProfitMaterial {
    public static void main(String[] args) {
        List<List<Integer>> materialList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // Enter the list of homes length
        System.out.println("Enter the list of homes length");
        int homeListLength = sc.nextInt();
        System.out.println("Enter the List of materials length");
        // Enter the List of materials length
        int materialLength = sc.nextInt();
        // Bind the value of the material cost
        System.out.println("Enter the material cost");
        for (int i = 0; i < homeListLength; i++) {
            List<Integer> cost = new ArrayList<>();
            for (int j = 0; j < materialLength; j++) {
                cost.add(sc.nextInt());
            }
            materialList.add(cost);

        }

        System.out.println(materialList.toString());

        int result = 0;
        for (int i = 0; i < homeListLength; i++) {
            int min = materialList.get(0).get(i);
            for (int j = 0; j < materialLength; j++) {
                if (min > materialList.get(j).get(i)) {
                    min = materialList.get(j).get(i);
                }
            }
            result += min;
        }
        System.out.println(result);

    }
}
