class BankAccount {
    protected int accountNumber;
    protected double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest Added: " + interest + " | New Balance: " + balance);
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Withdrawal of " + amount + " exceeds overdraft limit.");
        }
    }
}

class FixedDepositAccount extends BankAccount {
    private int maturityPeriod; // in years
    private double penaltyRate;

    public FixedDepositAccount(int accountNumber, double balance, int maturityPeriod, double penaltyRate) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
        this.penaltyRate = penaltyRate;
    }

    public void withdrawEarly(double amount) {
        double penalty = amount * (penaltyRate / 100);
        if (balance >= amount + penalty) {
            balance -= (amount + penalty);
            System.out.println("Withdrawn: " + amount + " | Penalty: " + penalty + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance after applying penalty.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Create SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount(1001, 5000, 4);
        savingsAccount.deposit(1000);
        savingsAccount.addInterest();
        System.out.println("Final Balance (SavingsAccount): " + savingsAccount.getBalance());

        // 2. Create CurrentAccount
        CurrentAccount currentAccount = new CurrentAccount(1002, 2000, 1000);
        currentAccount.withdraw(2500);
        System.out.println("Final Balance (CurrentAccount): " + currentAccount.getBalance());

        // 3. Create FixedDepositAccount
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(1003, 10000, 5, 2);
        fixedDepositAccount.withdrawEarly(5000);
        System.out.println("Final Balance (FixedDepositAccount): " + fixedDepositAccount.getBalance());
    }
}
