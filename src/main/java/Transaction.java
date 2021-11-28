import java.time.LocalDate;
public class Transaction {
    private LocalDate date;
    private double balance;
    private double withdraw = 0;
    private double deposit = 0;
    private long account;
    private Operation Operation;
    public Transaction(LocalDate date, double balance, String operation, double amount) {
        this.date = date;
        this.balance = balance;
        this.Operation = new Operation(operation,amount);
    }
    public Transaction(LocalDate date, double amount, long account, double balance) {
        this.date = date;
        this.balance = balance;
        this.account = account;
        this.Operation = new Operation("transfer", amount);
    }
    public LocalDate getDate() {
        return date;
    }
    public double getBalance() {
        return balance;
    }
    public double getWithdraw() {
        return withdraw;
    }
    public double getDeposit() {
        return deposit;
    }
    public long getAccount() {
        return account;
    }
    public Operation getOperation() {
        return Operation;
    }
}