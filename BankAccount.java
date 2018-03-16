package bankaccountapp;

import java.util.*;

public class BankAccount {
    
     private String accountName;
    private double newBalance;
     private double currentBalance;
    private double withdraw;
    private double deposit;
    private String sayName;
    private int operation;
    private int age;
    public double interestRate;
    private double interest;
    static Scanner console = new Scanner(System.in);
    
    BankAccount(){
        accountName = "Optics";
        currentBalance = 1000.0;
        newBalance = 0.0;
        withdraw = 0.0;
        deposit = 50.0;    
     }
    
    public void setAccountName(String accountName)
    {
        this.accountName = accountName;
    }
    public String getAccountName(){
        return accountName;
    }
    
     public void setNewBalance(double newBalance)
    {
        this.newBalance = newBalance;
    }
    public double getNewBalance(){
        return newBalance;
    }
    
    public void setCurrentBalance(double currentBalance)
    {
        this.currentBalance = currentBalance;
    }
    public double getCurrentBalance(){
        return currentBalance;
    }
    
    public void setWithdraw(double withdraw)
    {
        this.withdraw = withdraw;
    }
    public double getWithdraw(){
        return withdraw;
    }
    
    public void setDeposit(double deposit)
    {
        this.deposit = deposit;
    }
    public double getDeposit(){
        return deposit;
    }
    
    public void sayName(){
         System.out.print( "Account name is " + accountName );
        
    }
    
     public double balance(){
         System.out.print("Account balance is " + this.getCurrentBalance() );
        return currentBalance;
    }
     
     public double calculateWithdrawal(){
          System.out.println("Enter the amount you want to withdraw: "  );
          double withraw = console.nextDouble();
         newBalance= currentBalance - withdraw;
        return newBalance;
    } 
    
     public double calculateDeposit(){
         System.out.println("Enter the amount you deposited: "  );
         double deposit = console.nextDouble();
         newBalance= currentBalance + deposit;
        return newBalance;
    }
     
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        
        account1.setAccountName("Optics");
        System.out.println("Account name is: " + account1.getAccountName());
        
        
        account1.setCurrentBalance(1000.90);
        System.out.println("Your current balance is R: " + account1.getCurrentBalance() );
        
        System.out.println("Choose an operation you want to perform");
         System.out.println("1: Withrawals");
          System.out.println("2: Deposits");
        
        int operation;
        operation = console.nextInt();
        switch(operation){
            case 1:
                account1.calculateWithdrawal();
                System.out.println("Your new balance is R" + account1.getNewBalance());
                break;
            case 2: 
                 account1.calculateDeposit();
                 System.out.println("Your new balance is R" + account1.getNewBalance());
                break;
            default: System.out.println("Unknown operation");
                    
        }
       
        
    }
 
    
}
