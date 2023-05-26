package basics.encapsulation.bankAccount;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(675849);
        bankAccount.setBalance(56798.89);
        bankAccount.setCustomerName("John");

         System.out.println("Customer Name:"+bankAccount.getCustomerName());
        System.out.println("Customer Account NUmber:"+bankAccount.getAccountNumber());
        System.out.println("Customer Balance:"+bankAccount.getBalance());

    }
}
