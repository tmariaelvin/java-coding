package main.incubation;
import java.util.Scanner;
public class weekdaydisplay {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int weekday;
        weekday=sc.nextInt();
        switch (weekday) {
            case 1:
                System.out.println(" Monday ");
                break;
            case 2:
                System.out.println(" tusday ");
                break;
            case 3:
                System.out.println(" wendnesday ");
                break;
            case 4:
                System.out.println(" friday ");
                break;
            case 5:
                System.out.println(" thus ");
                break;
            case 6:
                System.out.println(" sat ");
                break;
            case 7:
                System.out.println(" sunday ");
                break;
            default:
                System.out.println(" not fount ");
                break;
        }


        }
    }


