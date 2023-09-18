package letcode;

public class MissingNumber {
    public static void main(String[] args) {
        int array[] = new int[]{4,2,3,5};
        int len = array.length+1;
        int avg  = len*(len+1)/2;
        int sum = 0;
        for(int i=0;i<len-1;i++){
            sum +=array[i];
        }
        System.out.println( avg - sum);
    }
}
