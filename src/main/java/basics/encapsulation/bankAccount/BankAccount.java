package basics.encapsulation.bankAccount;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;

    /**
     * Used getter and setter methods for the variables
     */

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    }
