package main.calculateBank;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class BankTransaction {
    public static void main (String[]args) {
        List<BankTransactionDetails> transactionDetails = readRecords("/home/spurge/Downloads/bank-data-main.simple.csv");
        BankCalculation bankCalculation = new BankCalculation();
        bankCalculation.profitAndLoss(transactionDetails);
        bankCalculation.mostCategorySpent(transactionDetails);
        bankCalculation.calculateTransactions(transactionDetails);
        bankCalculation.calculateTenExpenses(transactionDetails);
    }
    private static List<BankTransactionDetails> readRecords(String fileName){
        ArrayList<BankTransactionDetails> transactionDetails = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(Path.of("/home/provility/Downloads/bank-data-main.simple.csv"),
                StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                BankTransactionDetails amount = createRecords(attributes);
                transactionDetails.add(amount);
                line = br.readLine();
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return transactionDetails;
    }
    private static BankTransactionDetails createRecords(String[]attributes){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDate transactionDate = LocalDate.parse(attributes[0], formatter);
        int transactionAmount = Integer.parseInt(attributes[1]);
        String transactionReason = attributes[2];
        return new BankTransactionDetails(transactionDate, transactionAmount, transactionReason);
    }

}

