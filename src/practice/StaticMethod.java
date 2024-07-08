package practice;

public class StaticMethod {
    public static void main(String[] args) {
      addSum(10,2,3,4);
    }
    public static void addSum(int...js){
        for(int x:js){
            System.out.println(x);
        }
    }
}
