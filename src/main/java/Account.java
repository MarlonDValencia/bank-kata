import java.time.LocalDate;
import java.util.ArrayList;

public class Account {
    private double saldoActual = 0;
    private ArrayList<Transaction> Transacciones = new ArrayList<>();
    void deposit(int amount, String date) {
        if(amount <= 0){
            System.out.println("El valor ingresado debe ser mayor a cero");
        }
        this.saldoActual += amount;
        LocalDate Fecha = DateFormatter.format(date);
        Transacciones.add(new Transaction(Fecha, saldoActual, "deposito", amount));
    }
    void withdraw(int amount, String date){
        if(amount <= 0){
            System.out.println("El valor ingresado debe ser mayor a cero");
        }
        this.saldoActual -= amount;
        LocalDate Fecha = DateFormatter.format(date);
        Transacciones.add(new Transaction(Fecha, saldoActual, "retiro", amount));
    }
    public void transfer(int amount, long accountNumber, String date) {
        if (amount <= 0) {
            System.out.println("El valor ingresado debe ser mayor a cero");
        }
        this.saldoActual -= amount;
        LocalDate Fecha = DateFormatter.format(date);
        Transacciones.add(new Transaction(Fecha, saldoActual, "transferencia", amount));
    }
    void printStatements() {
        for (Transaction movimiento:this.Transacciones){
            System.out.println("------------------------------------------");
            System.out.println("Fecha: "+movimiento.getDate());
            System.out.println("Saldo de la cuenta en el momento: "+movimiento.getBalance());
            System.out.println("Tipo de operacion: "+movimiento.getOperation().getKind());
            System.out.println("Cantidad: "+movimiento.getOperation().getAmount());
            System.out.println("------------------------------------------");
        }
    }
    public String AcoountState() {
        return ("Saldo Actual: "+this.saldoActual);
    }
}
