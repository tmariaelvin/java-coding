package Zoho;

import java.util.Scanner;


public class Test3 {
    public static int ROW;
    public static int COL;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the ROW count: ");
        ROW = sc.nextInt();
        System.out.println("enter the COL count: ");
        COL = sc.nextInt();
        int[][] matrix = new int[ROW][COL];
        boolean[][] visited = new boolean[ROW][COL];
        int count = 0;

        System.out.println("Enter the value");
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (matrix[i][j] == 0 && !visited[i][j]) {
                    findLands(matrix, i, j, visited);
                    count++;
                }
            }
        }

        System.out.println("OutPut : " +count);
    }

    private static void findLands(int[][] matrix, int m, int n, boolean[][] visited) {
        int[] rowDirection = {-1, 1, 0, 0};
        int[] colDirection = {0, 0, -1, 1};
        visited[m][n]= true;
        for (int k = 0; k < 4; k++) {
            int newRow = m + rowDirection[k];
            int newCol = n + colDirection[k];
            if (newCol >= 0 && COL > newCol && newRow >= 0 && ROW > newRow && matrix[newRow][newCol] == 0 && !visited[newRow][newCol]) {
                findLands(matrix, newRow, newCol, visited);
            }
        }
    }
}

// 0 1 1 1 0 0 0
// 0 0 1 1 0 1 0