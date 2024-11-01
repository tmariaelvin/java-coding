package learn;

import java.util.Scanner;

public class Test3 {

    private static int ROWS = 3;
    private static  int COLS = 3;

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number of rows:");
        ROWS = sc.nextInt();
            System.out.println("Enter the number of columns:");
        COLS = sc.nextInt();

            int[][] matrix = new int[ROWS][COLS];

            System.out.println("Enter the matrix values row by row (0 for land, 1 for sea):");
            for (int i = 0; i < ROWS; i++) {
                for (int j = 0; j < COLS; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
        int numberOfIslands = countIslands(matrix);
        System.out.println("Number of islands: " + numberOfIslands);
    }

    public static int countIslands(int[][] matrix) {
        boolean[][] visited = new boolean[ROWS][COLS];
        int count = 0;

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (matrix[i][j] == 0 && !visited[i][j]) {
                    dfs(matrix, visited, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    private static void dfs(int[][] matrix, boolean[][] visited, int row, int col) {
        int[] rowDirection = {-1, 1, 0, 0};
        int[] colDirection = {0, 0, -1, 1};

        visited[row][col] = true;

        for (int k = 0; k < 4; k++) {
            int newRow = row + rowDirection[k];
            int newCol = col + colDirection[k];

            if (isValid(matrix, visited, newRow, newCol)) {
                dfs(matrix, visited, newRow, newCol);
            }
        }
    }

    private static boolean isValid(int[][] matrix, boolean[][] visited, int row, int col) {
        return row >= 0 && row < ROWS && col >= 0 && col < COLS && matrix[row][col] == 0 && !visited[row][col];
    }
}
