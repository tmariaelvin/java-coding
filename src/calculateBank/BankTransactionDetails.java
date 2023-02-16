package calculateBank;

        import java.time.LocalDate;
        import java.time.format.DateTimeFormatter;
        import java.util.List;
        import java.util.stream.DoubleStream;
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




