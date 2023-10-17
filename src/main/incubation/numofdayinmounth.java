 package main.incubation;
import java.util.Scanner;
public class numofdayinmounth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mounth, year, index;
        mounth = sc.nextInt();
        year=sc.nextInt();
            switch(mounth)
            {
                case 1:
                {
                    System.out.printf(" jan %d 31 days",year);
                    break;
                }
                case 2:
                {
                    if((year%4==0)||(year%400==0)) {
                        System.out.printf(" feb %d 29 days", year);
                    }
                    else{

                            System.out.printf(" feb %d 28 days",year);
                    }

                        break;
                    }
                case 3:
                {
                    System.out.printf(" march %d 31 days",year);
                }
                }
            }
        }

