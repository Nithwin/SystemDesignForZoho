package phase1.topic2;

class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private int balance;

    // Getters
    int getAccountNumber(){
        return this.accountNumber;
    }

    String getAccountHolder(){
        return this.accountHolder;
    }

    int getBalance(){
        return this.balance;
    }

    // Setters
    void deposit(double amount){
        this.balance += amount;
        System.out.println("Amount Deposited successfully");
    }

    void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient blance");
            return;
        }
        this.balance -= amount;
        System.out.println("Amount Withdrawed successfully");
    }


}

public class BankSimulation {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.deposit(1000);
        b1.withdraw(500);
        b1.withdraw(1500);
    }
}
