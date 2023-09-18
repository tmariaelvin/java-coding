package codingProblem;

public class RemoveWhiteSpace {
    public static void main(String[] args){
        String str =" e lv in an tony T     ";
       // System.out.println(str.trim());
        System.out.println(str.replaceAll("\\s",""));

    }
}
