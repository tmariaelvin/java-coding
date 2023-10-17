package main.simple;
import java.util.Scanner;
public class convertruppeintopaisa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the . value");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            int ruppe = (int) amount;
            double paisa = (amount - ruppe)*100;
            System.out.print("paisa : "+(int) paisa+"\n");
            System.out.println("Ruppe  :"+ruppe);
        }
    }
}
