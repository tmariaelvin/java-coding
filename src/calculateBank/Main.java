package calculateBank;//public class part2.Main {
//    public static void main(String[] args) {

////        //simple variables
////        int age = 30, temperature = 40;
////        System.out.println( temperature);
////        System.out.println(age + temperature);
////        System.out.println("Hello Java World");

////        //primitive types
////        byte adultAge = 22;
////        long viewsCount = 3_123_456_789L;
////        boolean isEligible = false;
////        float price = 10.99F;
////        char letter = 'A';

//        Scanner scanner = new Scanner(System.in);
////        System.out.print("Age: "); //not println only print in the same line

////        byte age = scanner.nextByte();
////        System.out.println("you are  " + age);
//
//        final byte MONTHS_IN_YEAR = 12;
//        final byte PERCENTAGE = 100;
//
//        System.out.print("principle: ");
//        int principle = scanner.nextInt();
//
//        System.out.print("Annual Interest Rate: ");
//        float annualInterest = scanner.nextFloat();
//        float monthlyInterest = annualInterest/PERCENTAGE/MONTHS_IN_YEAR;
//
//        System.out.print("Period(Years): ");
//        byte years = scanner.nextByte();
//        int numberOfPayments = years * MONTHS_IN_YEAR;
//
//        double mortgage = principle
//                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
//
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println("Mortgage: " + mortgageFormatted);
//
//        //for loop
//
//        String value = "Hello World";
//
//        for (int i= 0; i< 5; i++){
//            System.out.println(value);
//        }
//
////        System.out.println("start");
////        printNumbers(4);
////        System.out.println("finish");
////    }
////    public static void printNumbers(int limit){
////        for (int i=0; i<=limit; i++)
////            System.out.println(i);
//    }
//}

//public class part2.Main {
//    public static void main(String[] args) {
//        var textBox1 = new practice.TextBox();
//        textBox1.setText("Box 1");
//        System.out.println(textBox1.text.toUpperCase()); // state in the data of the 1st textbox
//
//        //these 2(textBox1 & textBox2 objects r completely indeendent to each other, they have diff data, diff states)
//
//        var textBox2 = new practice.TextBox();
//        textBox1.setText("Box 5 ");
//        System.out.println(textBox1.text);  // state in the data of the 2nd textbox

//        var employee = new practice.Employee(50_000, 20);
//        practice.Employee.printNumberOfEmployees();
//        int wage = employee.calculateWage();
//        System.out.println(wage);

//          var employee = new practice.Employee();
//          employee.baseSalary = 50000;
//            employee.setBaseSalary(50_000);
////            employee.getBaseSalary();
//            employee.setHourlyRate(20);
//            int wage = employee.calculateWage(5);
//            int wage1 = employee.calculateWage(0);
//        System.out.println(wage);
//        System.out.println(wage1);
//    }
//}

//public class part2.Main {
//
//    public static void main(String[] args) {
//        var employee = new practice.Employee(50_000, 20);
//        practice.Employee.printNumberOfEmployees();
//        int wage = employee.calculateWage();
//        System.out.println(wage);
//    }
//}


//import java.io.*;
//import java.util.Scanner;

//public class Main {
//
//    public static void main(String[] args) throws Exception {
//        BankTransaction bankTransaction1 = new BankTransaction();
//        BankCalculation bankCalculation1 =new BankCalculation();
////        bankTransaction1.transact();
//         }
//}


import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
//        List<BankTransactionDetails> transactionDetails = readRecords("/home/spurge/Downloads/bank-data-simple.csv");
//
//        Scanner scanner = new Scanner(new File("/home/spurge/Downloads/bank-data-simple.csv"));
//
//
//        scanner.useDelimiter(",");
//
//        while (scanner.hasNext()) {
//            System.out.print(scanner.next() + " | ");
//        }
//
//        scanner.close();
//
//        // Ignore the header line
//        if (scanner.hasNextLine()) {
//            scanner.nextLine();
//        }
//
//        // Store the frequency of liked_ad for each user_id
//        Map<String, Integer> map = new HashMap<>();
//        while (scanner.hasNextLine()) {
//            String[] data = scanner.nextLine().split(",");
//            if (data.length >= 3 && Boolean.parseBoolean(data[2])) {
//                map.merge(data[0], 1, Integer::sum);
//            }
//        }
//
//        // Sort the Map on values and display each entry
//        map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//                .forEach(System.out::println);

        Integer[] numbers = new Integer[] { 1, 2, 1, 3, 4, 4 };
        Set<Integer> allItems = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(numbers)
                .filter(n -> !allItems.add(n)) //Set.add() returns false if the item was already in the set.
                .collect(Collectors.toSet());
        System.out.println(duplicates); // [1, 4]
   }
}



//public void mostCategorySpent(List<BankTransactionDetails> bankTransactionDetails) {

//                for (BankTransactionDetails detail : bankTransactionDetails){
//                    int amount = detail.amount;
//                    System.out.println(amount);
//                    List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 4, 4);
//                    System.out.println(numbers);
//                    Set<Integer> duplicatedNumbersRemovedSet = new HashSet<>();
//                    Set<Integer> duplicatedNumbersSet = numbers.stream().filter(n -> !duplicatedNumbersRemovedSet.add(n)).collect(Collectors.toSet());
////                        System.out.println(duplicatedNumbersSet); // [1, 4]
//            sortedxpenses.forEach(expense -> System.out.println(expense.amount));
//
//
//                }















