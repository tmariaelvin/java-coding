package practice;

public class TwoArraySum {
    public static void main(String[] args) {
        int arr1[] = {5, 6, 3};
        int arr2[] = {4, 4, 5};
        int caryOver = 0;
        int sum = 0;
        int total = 0;
        int start = 0;
        int end = arr1.length - 1;

        while (arr1.length > start || arr2.length > start) {

            sum += caryOver + arr1[end] + arr2[start];
            if (sum / 10 > 0) {
                caryOver = sum / 10;
                sum += 10 * sum % 10;
            } else {
                caryOver = 0;
            }

            total += sum * 10;


        }
    }
}
