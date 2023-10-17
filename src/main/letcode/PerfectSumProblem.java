package main.letcode;

public class PerfectSumProblem {
    public static void main(String[] args) {
        int arr[] = new int[]{8, 1, 9, 8, 4, 3, 1, 1, 2}; // 8 1 9 8 4 3 1 1 2
        int n = 9;
        int sum = 8;
        int count = 0;
        int res = 0;
        for(int i=0;i<n;i++) {
            res = arr[i];
            if (res == sum) {
                count++;
                continue;
            }
            if (res > sum) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (res == sum) {
                    count++;
                    break;
                }
                if (res > sum) {
                    res = res - arr[j-1];
                    continue;
                }
                res = res + arr[j];
                if (res == sum) {
                    count++;
                    res = arr[i];
                }
                if (res > sum) {
                    res = res - arr[j-1];
                    continue;
                }

            }
        }
        System.out.println(count);
    }
}

/*static int count;
    static int sum;
    static int n;

    // Driver code
    public static void main (main.String[] args) {
        count = 0;
        n = 5;
        sum = 10;

        int[] pat = {2, 3, 5, 6, 8, 10};

        f(pat, 0, 0);

        System.out.println(count);
    }

    // Function to select or not the array element
    // to form a subset with given sum
    static void f(int[] pat, int i, int currSum) {
        if (currSum == sum) {
            count++;
            return;
        }
        if (currSum < sum && i < n) {
            f(pat, i+1, currSum + pat[i]);
            f(pat, i+1, currSum);
        }
    }*/