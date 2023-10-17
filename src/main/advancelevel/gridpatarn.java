package main.advancelevel;
import java.util.Scanner;
public class gridpatarn {
    public  static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
            int number;
            number=sc.nextInt();
            for(int index=1;index<=number*2;index=index+2) {
                if (index % 2 == 1) {
                    for (int j = 1; j <= number; j++) {
                        System.out.print("-");
                    }
                    System.out.println();
                } else {
                    System.out.println();
                }
            }

    }
}
