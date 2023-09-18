package letcode;

public class MoveZero {
    public static void main(String[] args) {
        int[] arrs = new int[]{1, 0, 0, 2, 4, 0, 2, 5};
        int k = 0;
        for (int i = 0; i < arrs.length; i++) {

            if (arrs[i] != 0) {
                int temp = arrs[i];
                arrs[i] = arrs[k];
                arrs[k] = temp;
                k++;
            }
        }
        for (int arr : arrs) {
            System.out.print(arr);
        }
    }
}