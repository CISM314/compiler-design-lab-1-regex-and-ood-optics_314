package bankaccountapp;


public class CheckingAccount {
    public CheckingAccount(int initialBalance){
        super (initialBalance);
        transactionCount = 0;
    }
    public void deposit (double amount){
        transactionCount++;
        super.deposit(amount);
    }
    public void withdraw {
    transactionCount++;
    super.withdraw(amount);
}
    public void deductFees(){
        if (transactionCount > FREE_TRANSACTIONS){
            double fees = TRANSACTION_FEE *
                    (transactionCount - FREE_TRANSACTIONS);
            super.withdraw(fees);
        }
        transactionCount = 0;
    }
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 2.0;
}
