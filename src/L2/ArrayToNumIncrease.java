package L2;

import java.util.Scanner;

public class ArrayToNumIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        int result = 0;
        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }
        int increse = 1;
        for (int i = arraySize - 1; i >= 0; i--) {
            result = array[i] * increse + result;
            increse *= 10;
        }

        System.out.println(result+1);
    }
}
