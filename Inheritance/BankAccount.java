
class BankAccount {
    private double balance;

    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    double getBalance() {
        return balance;
    }
}


class SavingsAccount extends BankAccount {

    SavingsAccount(double initialBalance) {
        super(initialBalance);
    }


    @Override
    void withdraw(double amount) {
        if (getBalance() - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal failed. Minimum balance of $100 must be maintained.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(200);

       
        savingsAccount.deposit(50);
        savingsAccount.withdraw(100); 
        savingsAccount.withdraw(150);
    }
}
