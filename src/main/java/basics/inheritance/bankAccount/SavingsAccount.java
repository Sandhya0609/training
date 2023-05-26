package basics.inheritance.bankAccount;

public class SavingsAccount extends BankAccount{
    static double minimumBalance=5000;
    public void withDraw(Double withDrawAmount){
        Double totalAmount =   balance -  withDrawAmount;
        System.out.println("Balance:"+balance+" withdrawal amount: "+withDrawAmount+" Minimum balance:"+minimumBalance+" total amount:"+totalAmount);

        if(totalAmount <= minimumBalance){
            System.out.println("No Sufficient funds to withdraw...");
        }else {
            System.out.println("Please collect money");
        }

    }
}
