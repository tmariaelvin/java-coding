package letcode;

public class SingleUniqueValue {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,2,3,4,4};
        int total = 0;
        for(int i=0;i<arr.length;i++){
            total = arr[i]^total;
        }

        System.out.println(total);
        int[] res = new int[arr.length];
        for(int i=0;i< arr.length;i++){
            res[i]++;
        }
        for(int i=0;i< arr.length;i++){

        }
    }
}
