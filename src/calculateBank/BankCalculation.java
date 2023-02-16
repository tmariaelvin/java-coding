package calculateBank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;

public class BankCalculation {
    public void profitAndLoss(List<BankTransactionDetails> bankTransactionDetails) {
        //task 1 => what is the total profit & loss? is it positive or negative?

        int totalAmount = 0;
        int debitLoss = 0;
        int creditProfit = 0;

        for (BankTransactionDetails detail : bankTransactionDetails) {
            if (detail.amount > 0) {
                creditProfit += detail.amount;
            }
            if (detail.amount < 0) {
                debitLoss += detail.amount;
            }
            totalAmount = creditProfit + debitLoss;
        }
        if (totalAmount > 0) {
            System.out.println("The Positive values are " + creditProfit);
        }
        if (totalAmount > 0) {
            System.out.println("The Negative values are " + debitLoss);
        }
        if (totalAmount > 0) {
            System.out.println("The value is positive " + totalAmount);
        } else {
            System.out.println("The value is negative " + totalAmount);
        }

    }

    //task 4 => which category does he spend most of his money on?
    public void mostCategorySpent(List<BankTransactionDetails> bankTransactionDetails) {

        List<BankTransactionDetails> mostCategory = bankTransactionDetails.stream().filter(transaction -> transaction.amount < 0).toList();
        Map<String, List<BankTransactionDetails>> transactionValues = mostCategory.stream().collect(Collectors.groupingBy(detail -> detail.transactionReason));
        int max = 0;
        String reason = "";
        for (Map.Entry<String, List<BankTransactionDetails>> entry : transactionValues.entrySet()) {
            List<BankTransactionDetails> transactonList = entry.getValue();
            if (transactonList.size() > max) {
                max = transactonList.size();
                reason = entry.getKey();
            }
        }
        System.out.println("The Money Spent Most on category is : " + reason + " and" + " " + max + " Times Spent");
    }

    //task 2 => how many transactions are there in a particular month?
    public void calculateTransactions(List<BankTransactionDetails> bankTransactionDetails) {
        List<BankTransactionDetails> monthTransaction = bankTransactionDetails.stream().filter(transaction -> transaction.amount < 0).toList();
        Map<Object, List<BankTransactionDetails>> transactions = bankTransactionDetails.stream().collect(Collectors.groupingBy(detail -> detail.date.getMonth()));
        for (Map.Entry<Object, List<BankTransactionDetails>> entry : transactions.entrySet()) {
            List<BankTransactionDetails> transactionValue = entry.getValue();
            int size = transactionValue.size();
            System.out.println("The Month " + entry.getKey() + " has " + size + " transactions");
        }
    }

    //task 3 => What are his top 10 expenses?
    public void calculateTenExpenses(List<BankTransactionDetails> bankTransactionDetails) {
        List<BankTransactionDetails> expenses = bankTransactionDetails.stream().filter(transaction -> transaction.amount < 0).toList();
        List<BankTransactionDetails> sortedExpenses = expenses.stream().sorted(Comparator.comparingInt(t -> t.amount)).toList();

        for (BankTransactionDetails debitAmount : sortedExpenses) {
            if (sortedExpenses.size() > 10) {
                List<BankTransactionDetails> topTenList = sortedExpenses.subList(0, 10);
                System.out.println("The Top " + topTenList.size() + " expenses are:");
                System.out.println("The Expense of" + Math.abs(debitAmount.amount) + " that spent for " + debitAmount.transactionReason);
            }
            System.out.println("The Top " + sortedExpenses.size() + " expenses are:");
            System.out.println("The Expense of " + Math.abs(debitAmount.amount) + " that spent for " + debitAmount.transactionReason);
        }
    }
}
