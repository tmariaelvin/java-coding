package main.calculateBank;

        import java.time.LocalDate;

public class BankTransactionDetails{
    LocalDate date;
    int amount;
    String transactionReason;
    public BankTransactionDetails(LocalDate date, int amount, String transactionReason) {
        this.date = date;
        this.amount = amount;
        this.transactionReason = transactionReason;
    }
}




