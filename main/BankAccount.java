package MultiThreadBankSystem.main;
import java.util.concurrent.*;
import java.util.*;
import java.util.logging.*;

import BankWithdrawlSystem.InsufficientFundsException;


public class BankAccount {
  private final int accountNumber;
  private double balance;
  private static final Logger logger = Logger.getLogger(BankAccount.class.getName());
  public BankAccount(int accountNumber, double amount){
    this.accountNumber = accountNumber;
    this.balance = amount;
  }
  public int getAccountNumber(){
    return this.accountNumber;
  }
  public synchronized void deposit(double amount){
    balance+=amount;
    logger.info("amount: "+ amount + "been credited to account number: " + accountNumber + ". The final balance amount is: "+ this.balance);
  }

  public synchronized void withdraw(double amount) throws InsufficientFundsException{
    if(this.balance<amount){
      throw new InsufficientFundsException("Insufficient Balance in account: "+ this.accountNumber);
    }
    balance -= amount;
    System.out.println(Thread.currentThread().getName() + "withdrew: " + amount + " and remaining balance is "+ balance);
  }

  public synchronized void transfer(BankAccount target , double amount) throws InsufficientFundsException{
    if(this.balance<amount){
      throw new InsufficientFundsException("Insufficient funds in bank account: "+ accountNumber );
    }
    this.withdraw(amount);
    target.deposit(amount);
    System.out.println(Thread.currentThread().getName() + "transferred" + amount + "to account: "+target.getAccountNumber());
  }
  
}
