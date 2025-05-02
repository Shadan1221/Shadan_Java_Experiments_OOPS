package Experiment7;

interface Wallet {
    void addFunds(double amount);
    void spendFunds(double amount);
}

class DigitalWallet implements Wallet {
    private double balance;

    @Override
    public void addFunds(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added $" + amount + " to the wallet.");
        } else {
            System.out.println("Invalid amount to add.");
        }
    }

    @Override
    public void spendFunds(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Spent $" + amount + " from the wallet.");
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class WalletDemo {
    public static void main(String[] args) {
        DigitalWallet wallet = new DigitalWallet();

        wallet.addFunds(100);
        wallet.spendFunds(30);
        wallet.spendFunds(80); 

        System.out.println("Current balance: $" + wallet.getBalance());
    }
}