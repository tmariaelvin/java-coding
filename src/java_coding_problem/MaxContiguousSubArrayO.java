package java_coding_problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxContiguousSubArrayO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] array = new int[len];
        List<Integer> resultArray= new ArrayList<>();
        List<String> rse = new ArrayList<>();
        rse.add("elv");
        rse.add("mas");
        System.out.println(rse.toString());
        for(int i=0;i<len;i++){
            array[i]=sc.nextInt();
        }
        int start;

            int i =0 ;
            start = array[i];
            for(int j=i+1;j<len;j++){
                if(start+1 == array[j] ){
                    start = array[j];
                    resultArray.add(array[i]);
                    i++;
                }
                else {

                    System.out.println(resultArray);
                    resultArray.clear();
                }
            }


    }

}
